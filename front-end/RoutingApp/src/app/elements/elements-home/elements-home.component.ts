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
      title: 'Fechadura Karli',
      imageUrl: 'assets/karli1.png',
      description: 'Fechadura Karli em Zamac Preto Texturizado para Banheiro'

    },
    {
      id: 3,
      title: 'Fechadura Opera',
      imageUrl: 'assets/opera1.png',
      description: 'Fechadura Opera Preto Texturizado para Banheiro'

    },
    {
      id: 4,
      title: 'Fechadura BMW',
      imageUrl: 'assets/bmw1.png',
      description: 'Fechadura BMW Seattle Bronze Oxidado para Banheiro'
  
    },
    {
      id: 5,
      title: 'Fechadura Karli',
      imageUrl: 'assets/karli2.png',
      description: 'Fechadura Karli em Zamac Corten para Banheiro'

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
