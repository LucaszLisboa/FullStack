import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardComponent } from './card/card.component';
import { ElementsHomeComponent } from './elements-home/elements-home.component';

const routes: Routes = [
  { path: 'elements', component: ElementsHomeComponent},
  { path: 'cards', component: CardComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ElementsRoutingModule { }
