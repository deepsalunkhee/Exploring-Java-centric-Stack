import { Component } from '@angular/core';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterModule,RouterLink],
  template: `  <main>
  <header  [routerLink]="['/']">
    <img class="brand-logo" src="/assets/logo.svg"  alt="logo" />
  </header>
  <section class="content">
    <router-outlet></router-outlet>
  </section>
</main> `,
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'demoTodo';
}
