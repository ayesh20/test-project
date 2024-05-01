 /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
showMenu('nav-toggle','nav-menu')
         let next = document.querySelector('.next')
         let prev = document.querySelector('.prev')
         
         next.addEventListener('click', function(){
             let items = document.querySelectorAll('.item')
             document.querySelector('.slide').appendChild(items[0])
         })
         
         prev.addEventListener('click', function(){
             let items = document.querySelectorAll('.item')
             document.querySelector('.slide').prepend(items[items.length - 1]) // here the length of items = 6
         })

