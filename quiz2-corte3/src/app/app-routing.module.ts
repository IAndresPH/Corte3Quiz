import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { MyMenuComponent } from './my-menu/my-menu.component';
import { MyInputComponent } from './my-input/my-input.component';

const routes: Routes = [
  {path:'input', component: MyInputComponent},
  {path:'menu', component: MyMenuComponent},
  {path: '**', redirectTo: 'menu', pathMatch: 'full'},
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }