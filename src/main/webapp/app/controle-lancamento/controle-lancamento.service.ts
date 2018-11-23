import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { ControleLancamento } from './controle-lancamento.model';


@Injectable()
export class ControleLancamentoService {

    public lancamentoModel: ControleLancamento = new ControleLancamento();

    constructor(private httpClient: HttpClient) { }

    public getAllControleLancamento(): Observable<any> {
        return this.httpClient.get<any>(`/api/controle-lancamento`, { observe: 'response'}).map((res: any) => res );
    }
}