import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'namefilterpipe'
})
export class NamefilterpipePipe implements PipeTransform {

  transform(studentList: any, searchText: any) {  
           if (searchText)  
    	            return studentList.filter(x => x.Name.toLowerCase().startsWith(searchText.toLowerCase()));  
  	              
            return studentList;  
    
  }

}
