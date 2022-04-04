import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-page-not-found',
  template: `
    <p>
      page-not-found!!!
    </p>
  `,
  styles: [
  ]
})
export class PageNotFoundComponent implements OnInit {

  constructor(private router: Router) { 
    //this is constructor
  }

  ngOnInit(): void {
    //this is method
  }

}
