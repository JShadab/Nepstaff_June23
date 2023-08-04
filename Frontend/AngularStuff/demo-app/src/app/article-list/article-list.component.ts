import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ArticleService } from '../article-service.service';

@Component({
  selector: 'app-article-list',
  templateUrl: './article-list.component.html',
  styleUrls: ['./article-list.component.css']
})
export class ArticleListComponent {

  authors: any[] = [];

  constructor(private articleService: ArticleService) { }

  ngOnInit() {

    this.articleService.getArticles().subscribe(resp => {
      console.log(resp);
      this.authors = resp["data"];
    });

  }

}
