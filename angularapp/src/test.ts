// This file is required by karma.conf.js and loads recursively all the .spec and framework files

<<<<<<< HEAD
import 'zone.js/dist/zone-testing';
=======
import 'zone.js/testing';
>>>>>>> b541e64b423fa6ea74bd26bb00178a14db236504
import { getTestBed } from '@angular/core/testing';
import {
  BrowserDynamicTestingModule,
  platformBrowserDynamicTesting
} from '@angular/platform-browser-dynamic/testing';

declare const require: {
  context(path: string, deep?: boolean, filter?: RegExp): {
<<<<<<< HEAD
    keys(): string[];
    <T>(id: string): T;
=======
    <T>(id: string): T;
    keys(): string[];
>>>>>>> b541e64b423fa6ea74bd26bb00178a14db236504
  };
};

// First, initialize the Angular testing environment.
getTestBed().initTestEnvironment(
  BrowserDynamicTestingModule,
<<<<<<< HEAD
  platformBrowserDynamicTesting()
);
=======
  platformBrowserDynamicTesting(),
);

>>>>>>> b541e64b423fa6ea74bd26bb00178a14db236504
// Then we find all the tests.
const context = require.context('./', true, /\.spec\.ts$/);
// And load the modules.
context.keys().map(context);
