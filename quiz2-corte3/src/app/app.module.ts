import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { InputsComponent } from './components/inputs/inputs.component';
import { MyMenuComponent } from './my-menu/my-menu.component';
import { MyInputComponent } from './my-input/my-input.component';
import { IdComponent } from './components/id/id.component';

@NgModule({
  declarations: [AppComponent, InputsComponent, MyMenuComponent, MyInputComponent, IdComponent],
  imports: [BrowserModule, IonicModule.forRoot(), AppRoutingModule],
  providers: [{ provide: RouteReuseStrategy, useClass: IonicRouteStrategy }],
  bootstrap: [AppComponent],
})
export class AppModule {}
