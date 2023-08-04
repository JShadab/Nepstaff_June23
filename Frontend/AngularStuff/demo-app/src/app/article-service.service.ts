import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  constructor(private httpClient: HttpClient) { }

  private url = "https://jsonmock.hackerrank.com/api/article_users/search?page=1";

  public getArticles() {    
   return this.httpClient.get<any>(this.url);
  }
}
