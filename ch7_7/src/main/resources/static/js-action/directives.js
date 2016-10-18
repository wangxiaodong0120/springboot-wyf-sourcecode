/**
 * 
 */

actionApp.directive('datePicker',function(){
    return {
        restrict: 'AC',
        link:function(scope,elem,attrs){
           // scope.treeObj = $.fn.zTree.init(elem, scope.settings);
            
            elem.datepicker();
        }
    };
});


