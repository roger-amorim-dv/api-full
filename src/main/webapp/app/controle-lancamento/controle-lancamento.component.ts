import { Component, OnInit } from '@angular/core';
import { ControleLancamento } from './controle-lancamento.model';
import { ControleLancamentoService } from './controle-lancamento.service';
import { TranslateService } from '@ngx-translate/core';
import { Message, ConfirmationService } from 'primeng/components/common/api';
@Component({
    templateUrl: './controle-lancamento.component.html',
    styleUrls: ['./controle-lancamento.scss']
})

export class ControleLancamentoComponent implements OnInit {

    controle: any;
    msg = [];
    public msgs: Message[];
    public controleLancamento: ControleLancamento[];

    constructor(
        public controleLancamentoService: ControleLancamentoService,
        private translate: TranslateService
    ) {
    }

    public ngOnInit(): void {
        this.getAllControleLancamento();
    }

    private getAllControleLancamento(): void {
        this.controleLancamentoService.getAllControleLancamento().subscribe((controle) => {
            this.controle = controle.body;
        }, (err) => {
            this.mostrarMensagem('error', 'Erro.', 'Ocorreu um erro ao buscar os controles cadastrados no sistema.');
        });
    }

    public mostrarMensagem(severidade, titulo, descricao): void {
        this.msgs = [];
        this.msgs.push({ severity: severidade, summary: titulo, detail: descricao });
    }
}