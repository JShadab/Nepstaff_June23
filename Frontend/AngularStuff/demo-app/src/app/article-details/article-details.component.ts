import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ArticleService } from '../article-service.service';

@Component({
  selector: 'app-article-details',
  templateUrl: './article-details.component.html',
  styleUrls: ['./article-details.component.css']
})
export class ArticleDetailsComponent {

  arr: any[] = [];

  constructor(private articleService: ArticleService) { }

  ngOnInit() {

    this.articleService.getArticles().subscribe(resp => {
      console.log(resp);
      this.arr = resp["data"];
    });

  }

}
