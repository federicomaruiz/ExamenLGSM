import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageMenuplatosComponent } from './page-menuplatos.component';

describe('PageMenuplatosComponent', () => {
  let component: PageMenuplatosComponent;
  let fixture: ComponentFixture<PageMenuplatosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageMenuplatosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageMenuplatosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
