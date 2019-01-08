import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddnumbersComponent } from './addnumbers.component';

describe('AddnumbersComponent', () => {
  let component: AddnumbersComponent;
  let fixture: ComponentFixture<AddnumbersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddnumbersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddnumbersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
