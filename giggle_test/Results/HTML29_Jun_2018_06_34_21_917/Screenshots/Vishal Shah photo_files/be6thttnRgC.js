if (self.CavalryLogger) { CavalryLogger.start_js(["hMDr0"]); }

__d("XEventImpressionLoggerAsyncController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/events/ajax/{eventid}/impression/",{eventid:{type:"Int",required:true},acontext:{type:"StringToStringMap",required:true}})}),null);
__d("EventImpressionLogger",["Arbiter","AsyncRequest","EventActionContext","OnVisible","Scroll","XEventImpressionLoggerAsyncController"],(function a(b,c,d,e,f,g){__p&&__p();h.init=function(i,j){"use strict";return new h(i,j)};function h(i,j){"use strict";this.$EventImpressionLogger1=i;this.$EventImpressionLogger3=j;this.$EventImpressionLogger2=false;this.$EventImpressionLogger4=null;this.initListeners();this.$EventImpressionLogger5=new(c("OnVisible"))(this.$EventImpressionLogger1,this.$EventImpressionLogger7.bind(this),true,0)}h.prototype.initListeners=function(){"use strict";__p&&__p();var i=this.$EventImpressionLogger3;this.$EventImpressionLogger6=!i.start_signal;if(i.start_signal)c("Arbiter").subscribe(i.start_signal,function(j,k){this.$EventImpressionLogger4=k;this.$EventImpressionLogger6=true;if(this.$EventImpressionLogger4)this.$EventImpressionLogger7();else if(!this.$EventImpressionLogger2){this.$EventImpressionLogger5.reset();this.$EventImpressionLogger5.checkBuffer()}}.bind(this));if(i.stop_signal)c("Arbiter").subscribe(i.stop_signal,function(){this.$EventImpressionLogger4=null;this.$EventImpressionLogger6=false}.bind(this));if(i.check_signal)c("Arbiter").subscribe(i.check_signal,function(j,k){this.$EventImpressionLogger4=k;if(this.$EventImpressionLogger4)this.$EventImpressionLogger7();else if(!this.$EventImpressionLogger2){this.$EventImpressionLogger5.reset();this.$EventImpressionLogger5.checkBuffer()}}.bind(this))};h.prototype.$EventImpressionLogger7=function(){"use strict";__p&&__p();var i=this.$EventImpressionLogger3;if(!this.$EventImpressionLogger6)return;if(this.$EventImpressionLogger2)return;if(!document.documentElement||!document.documentElement.contains(this.$EventImpressionLogger1))return;var j=this.$EventImpressionLogger4;if(j&&j.rect){var k=this.$EventImpressionLogger1.getBoundingClientRect(),l=j.rect,m=0;if(c("Scroll").getTop(j))m=c("Scroll").getTop(j);if(l.left&&l.left>k.left)return;if(l.right&&l.right<k.right)return;if(l.top&&l.top>k.top-m)return;if(l.bottom&&l.bottom<k.bottom-m)return}var n=c("XEventImpressionLoggerAsyncController").getURIBuilder().setInt("eventid",i.event_id).setStringToStringMap("acontext",c("EventActionContext").toStringMap(i.action_context)).getURI();new(c("AsyncRequest"))(n).setHandler(function(o){this.$EventImpressionLogger2=!o.getError()}.bind(this)).send()};f.exports=h}),null);
__d("XEventsSuggestionRefreshController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/events/permalink/related_event/refresh/",{fetch_num:{type:"Int",defaultValue:1},key:{type:"String"},seed_eid:{type:"Int"},cursor:{type:"Int",defaultValue:0},displayed_events:{type:"IntVector"},acontext:{type:"StringToStringMap",required:true},filter_data:{type:"StringToStringMap",defaultValue:{}},pager_data:{type:"StringToStringMap"},removed_eid:{type:"Int"},row_id:{type:"String"}})}),null);
__d("EventSuggestionFetcher",["csx","cx","$","Animation","Arbiter","AsyncRequest","CSS","DOM","XEventsSuggestionRefreshController"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j={_displayedIDs:{},_eventsCache:{},_replacementRequestCache:{},addDisplayedEvent:function k(l){this._displayedIDs[l]=(this._displayedIDs[l]||0)+1},removeDisplayedEvent:function k(l){this._displayedIDs[l]--;if(this._displayedIDs[l]===0)delete this._displayedIDs[l]},_computeCacheKey:function k(l){return JSON.stringify(l.filter_data)+JSON.stringify(l.acontext)},replace:function k(l,m,n,o){if(!n)return;var p=this._computeCacheKey(n);if(!this._addReplacementRequest(p,l,m,o))return;this._setFetchData(p,n);this._replaceFromCache(p)},_addReplacementRequest:function k(l,m,n,o){if(!this._replacementRequestCache[l])this._replacementRequestCache[l]=[];for(var p=0;p<this._replacementRequestCache[l].length;p++)if(this._replacementRequestCache[l][p].eid===m)return false;this._replacementRequestCache[l].push({eid:m,row_id:n,callback:o});return true},_setFetchData:function k(l,m){if(this._eventsCache[l])return;this._eventsCache[l]={events:[],fetchdata:{filter_data:m.filter_data,acontext:m.acontext,seed_eid:m.seed_eid,cursor:0},fetching:false}},_replaceFromCache:function k(l){__p&&__p();while(this._replacementRequestCache[l].length>0)if(this._isCacheEmpty(l)){this._fetchEvent(l);return}else{var m=this._popFirstCachedEvent(l),n=this._replacementRequestCache[l].shift();this._replaceItem(n.row_id,m.item,m.divider);this.removeDisplayedEvent(n.eid);n.callback()}},_isCacheEmpty:function k(l){return!this._eventsCache[l]||this._eventsCache[l].events.length===0},cacheEvents:function k(l,m,n){if(!this._eventsCache[m])return;this._eventsCache[m].fetchdata.curser=n;this._eventsCache[m].fetching=false;l.forEach(function(o){this._eventsCache[m].events.push({event_id:o.id,item:o.item,divider:o.divider})},this);this._replaceFromCache(m)},_popFirstCachedEvent:function k(l){if(!this._eventsCache[l]||this._eventsCache[l].events.length===0)return null;var m=this._eventsCache[l].events.shift();if(this._eventsCache[l].events.length===0)delete this._eventsCache[l];return m},_fetchEvent:function k(l){if(!this._eventsCache[l]||this._eventsCache[l].fetching)return;this._eventsCache[l].fetching=true;var m=this._eventsCache[l].fetchdata,n=this._replacementRequestCache[l][0],o=c("XEventsSuggestionRefreshController").getURIBuilder().setInt("fetch_num",6).setString("key",l).setInt("seed_eid",m.seed_eid).setInt("cursor",m.cursor).setIntVector("displayed_events",Object.keys(this._displayedIDs)).setStringToStringMap("filter_data",m.filter_data).setStringToStringMap("acontext",m.acontext).setStringToStringMap("pager_data",{fetch_num:6,key:l}).setInt("removed_eid",n.eid).setString("row_id",n.row_id).getURI();new(c("AsyncRequest"))(o).setErrorHandler(function(){this._eventsCache[l].fetching=false}.bind(this)).send()},_replaceItem:function k(l,m,n){__p&&__p();var o=c("$")(l);c("CSS").addClass(o,"fbEventsSuggestionRemovingItem");c("DOM").insertAfter(o,m);if(n)c("DOM").insertBefore(o,n);new(c("Animation"))(o).to("opacity",0).duration(500).ondone(function(){__p&&__p();c("CSS").hide(o);c("CSS").addClass(m,"fbEventsSuggestionShowingItem");c("CSS").show(m);c("DOM").remove(o);o=null;new(c("Animation"))(m).from("opacity",0).to("opacity",1).ondone(function(){if(n){c("DOM").remove(n);n=null}m.style.opacity=null;c("CSS").removeClass(m,"fbEventsSuggestionShowingItem");c("Arbiter").inform("EventSuggestion/insert")}).duration(300).ease(c("Animation").ease.end).show().go()}.bind(this)).ease(c("Animation").ease.end).hide().go()},_removeItem:function k(l){var m=c("$")(l);c("DOM").remove(m)},_clearEmptyCard:function k(l){var m=c("$")(l),n=c("DOM").scry(m,"div.fbEventsSuggestionItem");if(n.length===0)n=c("DOM").scry(m,"li.fbEventsSuggestionItem");if(n.length===0)c("DOM").remove(m)},clearItems:function k(l,m){if(!this._eventsCache[l])return;this._eventsCache[l].fetching=false;while(this._replacementRequestCache[l].length>0){var n=this._replacementRequestCache[l].shift();this._removeItem(n.row_id);this.removeDisplayedEvent(n.eid)}this._clearEmptyCard(m)}};f.exports=j}),null);
__d("XEventsSuggestionHideController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/events/permalink/related_event/update/",{removed_eid:{type:"Int",required:true},acontext:{type:"StringToStringMap",required:true},hide_type:{type:"String",required:true}})}),null);
__d("EventsSuggestionSync",["Arbiter","AsyncRequest","EventSuggestionFetcher","XEventsSuggestionHideController","EventSuggestionHideAction"],(function a(b,c,d,e,f,g){__p&&__p();var h={init:function i(){c("Arbiter").subscribe("EventSuggestions/report",this.reportEvent.bind(this))},setData:function i(j,k,l,m){if(!this._data)this._data={};this._data[j]={removed_eid:j,row_id:m,filter_data:l,acontext:k}},setListener:function i(j,k){c("EventSuggestionFetcher").addDisplayedEvent(k);j.getMenu().subscribe("itemclick",function(l,m){switch(m.item.getValue()){case c("EventSuggestionHideAction").HIDE:this._hideItem(k,c("EventSuggestionHideAction").HIDE);this.replace(k);break}}.bind(this))},reportEvent:function i(j,k){this._hideItem(k.eid,c("EventSuggestionHideAction").REPORT);this.replace(k.eid)},_hideItem:function i(j,k){if(!this._data||!this._data[j])return;var l=c("XEventsSuggestionHideController").getURIBuilder().setInt("removed_eid",this._data[j].removed_eid).setStringToStringMap("acontext",this._data[j].acontext).setString("hide_type",k).getURI();new(c("AsyncRequest"))(l).send()},replace:function i(j){if(!this._data||!this._data[j])return;c("EventSuggestionFetcher").replace(j,this._data[j].row_id,this._data[j],function(){this._removeEvent(j)}.bind(this))},_removeEvent:function i(j){if(this._data)delete this._data[j]}};f.exports=h}),null);
__d("UpdateRelatedEvents",["csx","cx","Arbiter","AsyncRequest","EventSuggestionFetcher","EventSuggestionHideAction","XEventsSuggestionHideController","ge"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j={init:function k(l,m,n){this._seedID=l;this._actionContext=m;this._data={};c("Arbiter").subscribe("EventSuggestions/report",this.reportEvent.bind(this))},setListener:function k(l,m,n,o){c("EventSuggestionFetcher").addDisplayedEvent(m);this._data[m]={removed_eid:m,seed_eid:this._seedID,row_id:n,filter_data:o,acontext:this._actionContext};l.getMenu().subscribe("itemclick",function(p,q){switch(q.item.getValue()){case c("EventSuggestionHideAction").HIDE:this._hideItem(m,c("EventSuggestionHideAction").HIDE);this.replace(m);break}}.bind(this))},reportEvent:function k(l,m){this._hideItem(m.eid,c("EventSuggestionHideAction").REPORT);this.replace(m.eid)},_hideItem:function k(l,m){if(!this._data||!this._data[l])return;var n=c("XEventsSuggestionHideController").getURIBuilder().setInt("removed_eid",this._data[l].removed_eid).setStringToStringMap("acontext",this._data[l].acontext).setString("hide_type",m).getURI();new(c("AsyncRequest"))(n).send()},replace:function k(l){if(!this._data||!this._data[l])return;c("EventSuggestionFetcher").replace(l,this._data[l].row_id,this._data[l],function(){this._removeEvent(l)}.bind(this))},_removeEvent:function k(l){if(this._data)delete this._data[l]}};f.exports=j}),null);
__d("EventSuggestionAction",["csx","cx","Animation","CSS","DOM","Event","EventActionSource","EventsSuggestionSync","EventSuggestionHideAction","UpdateRelatedEvents","$"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j={_canShowNux:true,_xoutShowing:false,_reportDialogs:{eventData:{},dialogs:{}},_nux:{},_items:{},_timers:{},registerReportDialog:function k(l,m){l.subscribe(["show"],function(){this._reportDialogs.dialogs[m]={showing:true};this._stopRefresh(this._reportDialogs.eventData.eid,this._reportDialogs.eventData.source)}.bind(this));l.subscribe(["hide"],function(){this._reportDialogs.dialogs[m]={showing:false};this._startRefresh(this._reportDialogs.eventData.eid,this._reportDialogs.eventData.source)}.bind(this))},_isReportDialogShowing:function k(){for(var l in this._reportDialogs.dialogs)if(Object.prototype.hasOwnProperty.call(this._reportDialogs.dialogs,l)&&this._reportDialogs.dialogs[l].showing)return true;return false},addNux:function k(l,m){this._nux[m]=l},registerXOutMenu:function k(l,m,n){__p&&__p();l.getPopover().subscribe("hide",function(){this._xoutShowing=false;this._startRefresh(m,n)}.bind(this));l.getPopover().subscribe("show",function(){this._xoutShowing=true;this._stopRefresh(m,n)}.bind(this));l.getMenu().subscribe("itemclick",function(o,p){switch(p.item.getValue()){case c("EventSuggestionHideAction").REPORT:this._reportDialogs.eventData={eid:m,source:n};break}}.bind(this))},addButton:function k(l,m,n,o){__p&&__p();if(!this._items[o]){this._items[o]={};this._timers[o]={}}c("Event").listen(l,"click",function(){__p&&__p();var p=this._items[o][n];if(!p){p=c("DOM").find(l,"^.fbEventsSuggestionItem");this._items[o][n]=p}if(m==="watch"||m==="join"||m==="save"||m==="maybe"){c("CSS").addClass(p,"fbEventsSuggestionFadingItem");var q=null;if(m==="maybe"){c("CSS").addClass(p,"fbEventsSuggestionMaybedItem");q=".fbEventsSuggestionImageMaybeOverlay"}if(m==="join"){c("CSS").addClass(p,"fbEventsSuggestionJoinedItem");q=".fbEventsSuggestionImageJoinedOverlay"}if(m==="watch"){c("CSS").addClass(p,"fbEventsSuggestionWatchedItem");q=".fbEventsSuggestionImageWatchedOverlay"}if(m==="save"){c("CSS").addClass(p,"fbEventsSuggestionSavedItem");q=".fbEventsSuggestionImageSavedOverlay"}if(q)this.easeInImageOverlay(p,q)}else{c("CSS").removeClass(p,"fbEventsSuggestionFadingItem");if(this._timers[o][n]){clearTimeout(this._timers[o][n]);delete this._timers[o][n]}}c("Event").listen(p,"mouseout",function(){this._startRefresh(n,o)}.bind(this));c("Event").listen(p,"mouseover",function(){this._stopRefresh(n,o)}.bind(this))}.bind(this))},_startRefresh:function k(l,m){__p&&__p();if(!this._items[m])return;var n=this._items[m][l];if(!n||this._xoutShowing)return;if(this._isReportDialogShowing()&&this._reportDialogs.eventData.eid===l)return;var o=this._nux[m],p=!o||!o.isShown();if(c("CSS").matchesSelector(n,".fbEventsSuggestionFadingItem")&&p)this._timers[m][l]=setTimeout(function(){this.refreshItem(l,m)}.bind(this),3600)},_stopRefresh:function k(l,m){if(this._timers[m]&&this._timers[m][l]){clearTimeout(this._timers[m][l]);delete this._timers[m][l]}},refreshItem:function k(l,m){__p&&__p();var n=null;if(m===c("EventActionSource").EVENT_DASHBOARD_SUGGESTION_UPCOMING||m===c("EventActionSource").EVENT_DASHBOARD_SUGGESTION_PAST||m===c("EventActionSource").EVENT_DASHBOARD_SUGGESTION_BIRTHDAYS||m===c("EventActionSource").EVENT_SUGGESTION)n=c("UpdateRelatedEvents");else if(m===c("EventActionSource").EVENT_BOTTOM_SUGGESTION||m===c("EventActionSource").DASHBOARD_FRIEND_EVENT||m===c("EventActionSource").DASHBOARD_RELATED_EVENT||m===c("EventActionSource").DASHBOARD_POPULAR_EVENT)n=c("EventsSuggestionSync");else if(m===c("EventActionSource").DASHBOARD_SUBSCRIBED_CARD)if(this._items[m]&&this._items[m][l]){c("DOM").remove(this._items[m][l]);delete this._items[m][l]}if(!n)return;n.replace(l)},easeInImageOverlay:function k(l,m){var n=c("DOM").find(l,".fbEventsSuggestionImageOverlay"),o=c("DOM").find(l,m);new(c("Animation"))(n).from("opacity",0).to("opacity",1).duration(200).ondone(function(){c("CSS").show(n);n.style.opacity=null;new(c("Animation"))(o).from("opacity",0).to("opacity",1).duration(200).ondone(function(){c("CSS").show(o);o.style.opacity=null}).ease(c("Animation").ease.end).show().go()}).ease(c("Animation").ease.end).show().go()},swapItem:function k(l,m,n){__p&&__p();var o=c("$")(l),p=c("$")(m);c("CSS").addClass(o,"fbEventsSuggestionRemovingItem");if(n)c("DOM").insertBefore(o,n);new(c("Animation"))(o).to("opacity",0).duration(500).ondone(function(){__p&&__p();c("CSS").hide(o);c("CSS").addClass(p,"fbEventsSuggestionShowingItem");c("CSS").show(p);c("DOM").remove(o);o=null;new(c("Animation"))(p).from("opacity",0).to("opacity",1).ondone(function(){p.style.opacity=null;if(n){c("DOM").remove(n);n=null}c("CSS").removeClass(p,"fbEventsSuggestionShowingItem")}).duration(300).ease(c("Animation").ease.end).show().go()}.bind(this)).ease(c("Animation").ease.end).hide().go()},clearEmptyCard:function k(l){var m=c("$")(l),n=c("DOM").scry(m,"div.fbEventsSuggestionItem");if(n.length===0)n=c("DOM").scry(m,"li.fbEventsSuggestionItem");if(n.length===0)c("DOM").remove(m)}};f.exports=j}),null);
__d("EventSuggestionXOutMenuController",[],(function a(b,c,d,e,f,g){__p&&__p();function h(i,j){"use strict";this.$EventSuggestionXOutMenuController1=i;this.$EventSuggestionXOutMenuController2=j}h.prototype.getMenu=function(){"use strict";return this.$EventSuggestionXOutMenuController1};h.prototype.getPopover=function(){"use strict";return this.$EventSuggestionXOutMenuController2.getPopover()};f.exports=h}),null);