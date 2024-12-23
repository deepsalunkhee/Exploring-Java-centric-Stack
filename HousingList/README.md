# DemoTodo

This project was generated using [Angular CLI](https://github.com/angular/angular-cli) version 19.0.3.

## Development server

To start a local development server, run:

```bash
ng serve
```

Once the server is running, open your browser and navigate to `http://localhost:4200/`. The application will automatically reload whenever you modify any of the source files.

## Code scaffolding

Angular CLI includes powerful code scaffolding tools. To generate a new component, run:

```bash
ng generate component component-name
```

For a complete list of available schematics (such as `components`, `directives`, or `pipes`), run:

```bash
ng generate --help
```

## Building

To build the project run:

```bash
ng build
```

This will compile your project and store the build artifacts in the `dist/` directory. By default, the production build optimizes your application for performance and speed.

## Running unit tests

To execute unit tests with the [Karma](https://karma-runner.github.io) test runner, use the following command:

```bash
ng test
```

## Running end-to-end tests

For end-to-end (e2e) testing, run:

```bash
ng e2e
```

Angular CLI does not come with an end-to-end testing framework by default. You can choose one that suits your needs.

## Additional Resources

For more information on using the Angular CLI, including detailed command references, visit the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.


### file stuucture suggested 

src/
├── app/
│   ├── core/
│   │   ├── models/
│   │   │   └── todo.model.ts      # TypeScript interface for Todo
│   │   ├── services/
│   │   │   └── todo.service.ts    # Service to manage Todo logic
│   │   └── core.module.ts         # Optional: Core module for singletons
│   ├── shared/
│   │   └── components/
│   │       ├── todo-item/
│   │       │   ├── todo-item.component.html   # HTML for a single todo item
│   │       │   ├── todo-item.component.ts     # Component logic
│   │       │   ├── todo-item.component.scss   # SCSS for a single todo item
│   │       └── shared.module.ts               # Optional: Shared module
│   ├── features/
│   │   ├── todo/
│   │       ├── todo.component.html            # Main component HTML
│   │       ├── todo.component.ts              # Main component logic
│   │       ├── todo.component.scss            # Main component SCSS
│   │       ├── todo.module.ts                 # Todo feature module
│   │       ├── todo-routing.module.ts         # Routing for the todo feature
│   │       └── components/                    # Sub-components, if any
│   ├── app.component.html                     # Root application HTML
│   ├── app.component.ts                       # Root application logic
│   ├── app.component.scss                     # Root application SCSS
│   ├── app.module.ts                          # Root application module
│   └── app-routing.module.ts                  # Application-wide routing
├── assets/
│   └── styles/                                # Global SCSS styles
├── environments/                              # Environment configurations
│   ├── environment.ts                         # Development config
│   └── environment.prod.ts                    # Production config
└── index.html                                 # Main entry point
