import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  private title: string = 'Testeeeee';
  private data: PADOInterface[] = [
    {
      id: 1,
      title: 'GOKU',
      imageUrl: 'assets/goku.webp',
      imageTwo: 'assets/goku_sayajin.gif'
    },
    {
      id: 2,
      title: 'VEGETA',
      imageUrl: 'assets/vegeta.png',
      imageTwo: 'assets/vegeta_sayajin.webp'
    },
    {
      id: 3,
      title: 'GOHAN',
      imageUrl: 'assets/gohan.webp',
      imageTwo: 'assets/gohan_sayajin.gif'
    },
    {
      id: 4,
      title: 'BILLS',
      imageUrl: 'assets/bills.png',
      imageTwo: 'assets/bills_form.gif'
    }
  ]

  constructor(){}

  //GETTERS and SETTERS
  protected getTitle(){
    return this.title;
  }

  protected setTitle(event: any){
    this.title = event.target.value;
  }

  protected getData(): PADOInterface[]{
    return this.data;
  }
}

//////////INTERFACE////////////////////////////////
interface PADOInterface{
  id: number;
  title: string;
  imageUrl: string;
  imageTwo: string;

}
