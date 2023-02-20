import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { MainComponent } from './components/main/main.component';
import { CardFormComponent } from './components/card-form/card-form.component';
import { CardComponent } from './components/card/card.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatInputModule} from "@angular/material/input";
import {MatIconModule} from "@angular/material/icon";
import {MatFormFieldModule} from "@angular/material/form-field";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatButtonModule} from '@angular/material/button';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatCardModule} from '@angular/material/card';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from "@angular/material/core";


const AngularMaterialModules = [
  MatInputModule,
  MatIconModule,
  MatFormFieldModule,
  MatButtonModule,
  MatProgressBarModule,
  MatCardModule,
  MatDatepickerModule,
  MatNativeDateModule
]

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    CardFormComponent,
    CardComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    ...AngularMaterialModules
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
