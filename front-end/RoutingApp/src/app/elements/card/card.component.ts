import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardComponent implements OnInit {

  @Input() title = "";
  @Input() id = 0
  @Input() imageUrl = ""
  @Input() description = ""

  constructor() { }

  ngOnInit(): void {
  }

}
