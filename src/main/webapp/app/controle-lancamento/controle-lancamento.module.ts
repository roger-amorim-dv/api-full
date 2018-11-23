import { MensagemService } from './../shared/mensagem/mensagem.service';
import { DragDropModule } from 'primeng/dragdrop';
import { PickListModule } from 'primeng/picklist';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import {
    CardModule,
    InputMaskModule,
    AccordionModule,
    DialogModule,
    DataTableModule,
    FileUploadModule,
    KeyFilterModule,
    MessagesModule,
    GrowlModule
   } from 'primeng/primeng';
import { TooltipModule } from 'primeng/tooltip';
import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { ChartModule } from 'primeng/chart';
import { RatingModule } from 'primeng/rating';
import { TableModule } from 'primeng/table';
import { TabViewModule } from 'primeng/tabview';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ControleLancamentoComponent } from './controle-lancamento.component';
import { ControleLancamentoService } from './controle-lancamento.service';

@NgModule({
    imports: [
        InputMaskModule,
        AccordionModule,
        DialogModule,
        DataTableModule,
        FileUploadModule,
        KeyFilterModule,
        MessagesModule,
        GrowlModule,
        TooltipModule,
        ChartModule,
        RatingModule,
        BrowserAnimationsModule,
        TableModule,
        TabViewModule,
        ConfirmDialogModule,
        DragDropModule,
        PickListModule,
    ],
    declarations: [
       ControleLancamentoComponent
    ],
    entryComponents: [
    ],
    providers: [
        ControleLancamentoService
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})

export class ControleLancamentoModule{

}