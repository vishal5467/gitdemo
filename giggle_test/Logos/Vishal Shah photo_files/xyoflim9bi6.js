if (self.CavalryLogger) { CavalryLogger.start_js(["ja7bW"]); }

__d("BanzaiLoginAndLogoutListener",["Banzai","Event"],(function a(b,c,d,e,f,g){var h={listen:function i(j){var k=function k(event){c("Banzai").flush()};c("Event").listen(j,"submit",k)}};f.exports=h}),null);
__d("LogoutMenu",["csx","DOMQuery","emptyFunction","Event","requireWeak","URI","ReactXUIMenu"],(function a(b,c,d,e,f,g,h){__p&&__p();var i;c("requireWeak")("MenuItem",function(k){i=k});function j(k,l,m){__p&&__p();var n=void 0;if(l)l.subscribe("confirm",function(){c("Event").fire(n,"submit");n.submit()});if(m)m.subscribe("confirm",function(){c("Event").fire(n,"submit");n.submit()});k.subscribe("itemclick",function(o,p){__p&&__p();switch(p.item.getValue()){case"logout":n=c("DOMQuery").find(k.getRoot(),"._w0d");break;case"createnewaccount":n=c("DOMQuery").find(k.getRoot(),"._3eei");break;case"switchaccount":n=c("DOMQuery").find(k.getRoot(),"._3eeq");break;case"help":if(i)i.prototype.hasAction=c("emptyFunction").thatReturnsFalse;break;default:break}if(n){var q=false,r="/confirmemail.php",s=c("URI").getRequestURI().getPath();if(s===r&&m){m.show();q=true}else if(s!==r&&l){l.show();q=true}if(!q){c("Event").fire(n,"submit");n.submit()}}})}f.exports.init=j}),null);
__d("PagesHovercardHeaderPinButton",["AsyncRequest","DOM"],(function a(b,c,d,e,f,g){"use strict";f.exports={init:function h(i,j,k,l){i.subscribe("change",function(m,n){var o=n.selected?"/ajax/bookmark/add/":"/ajax/bookmark/delete/",p=i.getRoot().firstChild;if(n.selected)c("DOM").replace(p,l);else c("DOM").replace(p,k);new(c("AsyncRequest"))().setMethod("POST").setURI(o).setData({id:j,reload_pagelet_navigation:true,ref:"admin_hovercard"}).send()})}}}),null);
__d("ServiceWorkerLoginAndLogoutListener",["Event","ServiceWorkerLoginAndLogout"],(function a(b,c,d,e,f,g){var h={listen:function i(j,k){var l=function l(){if(k==="login")c("ServiceWorkerLoginAndLogout").login();else if(k==="logout")c("ServiceWorkerLoginAndLogout").logout();else throw new Error("bad login type given")};c("Event").listen(j,{click:l,submit:l})}};f.exports=h}),null);