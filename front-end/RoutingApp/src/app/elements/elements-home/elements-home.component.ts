import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-elements-home',
  templateUrl: './elements-home.component.html',
  styleUrls: ['./elements-home.component.scss']
})
export class ElementsHomeComponent implements OnInit {
  private title: string = 'Teste';
  private data: PADOInterface[] = [
    {
      id: 1,
      title: 'Fechadura Zamac',
      imageUrl: 'assets/Zamac1.png',
      description: 'Fechadura Zamac Ascot Grafite Polido Externa'
    },
    {
      id: 2,
      title: 'Fechadura Zamac',
      imageUrl: 'assets/Zamac1.png',
      description: 'Fechadura Zamac Ascot Grafite Polido Externa'
    },
    {
      id: 2,
      title: 'Fechadura Zamac',
      imageUrl: 'assets/Zamac1.png',
      description: 'Fechadura Zamac Ascot Grafite Polido Externa'
    }
  ]

  //GETTERS and SETTERS
  protected getTitle(){
    return this.title;
  }

  protected setTitle(event: any){
    this.title = event.target.value;
  }

  constructor() { }

  protected getData(): PADOInterface[]{
    return this.data;
  }

  ngOnInit(): void {
  }

}

//////////INTERFACE////////////////////////////////
interface PADOInterface{
  id: number;
  title: string;
  imageUrl: string;
  description: string;

}
