import { Pipe, PipeTransform } from '@angular/core';
import { IEmployee } from './iemployee';
import { empty } from 'rxjs';

@Pipe({
  name: 'empsearch'
})
export class EmpsearchPipe implements PipeTransform {

  transform(value: IEmployee[], filterBy: string): IEmployee[] {
    filterBy = filterBy ? filterBy.toLocaleLowerCase() : null;
    return filterBy ? value.filter((emp: IEmployee) =>
       emp.name.toLocaleLowerCase().indexOf(filterBy) !== -1) : value;
  }

}
