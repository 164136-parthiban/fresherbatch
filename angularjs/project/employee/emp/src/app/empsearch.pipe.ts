import { Pipe, PipeTransform } from '@angular/core';
import { IEmployee } from './iemployee';
import { empty } from 'rxjs';

@Pipe({
  name: 'empsearch'
})
export class EmpsearchPipe implements PipeTransform {

  transform(value: String, args:IEmployee[]): number {
    if(value.toLowerCase.name=="parthiban")
    return 50;
  }

}
