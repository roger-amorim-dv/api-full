import { NgModule } from '@angular/core';

import { ApiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [ApiSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [ApiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ApiSharedCommonModule {}
