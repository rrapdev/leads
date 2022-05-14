import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'lead',
        data: { pageTitle: 'leadsApp.lead.home.title' },
        loadChildren: () => import('./lead/lead.module').then(m => m.LeadModule),
      },
      {
        path: 'lista',
        data: { pageTitle: 'leadsApp.lista.home.title' },
        loadChildren: () => import('./lista/lista.module').then(m => m.ListaModule),
      },
      {
        path: 'tag',
        data: { pageTitle: 'leadsApp.tag.home.title' },
        loadChildren: () => import('./tag/tag.module').then(m => m.TagModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
