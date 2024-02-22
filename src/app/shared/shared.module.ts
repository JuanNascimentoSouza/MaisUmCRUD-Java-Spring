import { CommonModule } from "@angular/common";
import { ErrorDialogComponent } from "./components/error-dialog/error-dialog.component";
import { CategoryPipe } from "./pipes/category.pipe";
import { AppMaterialModule } from "./app-material/app-material.module";
import { NgModule } from "@angular/core";

@NgModule({
  declarations: [
    ErrorDialogComponent,
    CategoryPipe
  ],
  imports: [
    CommonModule,
    AppMaterialModule
  ],
  exports: [
  ]
})
export class SharedModule { }
