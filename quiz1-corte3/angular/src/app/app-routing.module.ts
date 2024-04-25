import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { MyInputComponent } from './my-input/my-input.component';
import { MyButtonComponent } from './my-button/my-button.component';
import { MenuComponent } from './menu/menu.component';
import { ButtonsComponent } from './components/buttons/buttons.component';

const routes: Routes = [
  {path:'input', component: MyInputComponent},
  {path:'buttons', component: ButtonsComponent},
  {path:'button', component: MyButtonComponent},
  {path: 'home', component: MenuComponent},
  {path: '**', redirectTo: 'home', pathMatch: 'full'},
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
