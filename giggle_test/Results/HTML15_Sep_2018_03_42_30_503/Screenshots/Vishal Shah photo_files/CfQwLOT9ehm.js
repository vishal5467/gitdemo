if (self.CavalryLogger) { CavalryLogger.start_js(["dagd1"]); }

__d("PageVoiceDropdownSelector.react",["cx","BootloadedComponent.react","Image.react","JSResource","React","XUIPopoverButton.react","XUISpinner.react"],(function a(b,c,d,e,f,g,h){"use strict";__p&&__p();var i,j,k=c("React").PropTypes;i=babelHelpers.inherits(l,c("React").Component);j=i&&i.prototype;function l(){__p&&__p();var m,n;for(var o=arguments.length,p=Array(o),q=0;q<o;q++)p[q]=arguments[q];return n=(m=j.constructor).call.apply(m,[this].concat(p)),this.state={dialogShown:false,bootloadFinished:false},this.$PageVoiceDropdownSelector1=function(r){this.props.onChange(r);this.setState({dialogShown:false})}.bind(this),this.$PageVoiceDropdownSelector2=function(){return this.refs["open-menu-button"]}.bind(this),this.$PageVoiceDropdownSelector3=function(){this.setState({bootloadFinished:true})}.bind(this),this.$PageVoiceDropdownSelector7=function(event){this.setState({dialogShown:!this.state.dialogShown,shownBusinessID:this.state.defaultBusinessID},function(){return this.props.onClick(event)}.bind(this))}.bind(this),this.$PageVoiceDropdownSelector4=function(r){this.setState({dialogShown:r})}.bind(this),this.$PageVoiceDropdownSelector5=function(){var r=this.props.selectedActorID;if(!r)return"";if(r===this.props.user.id)return this.props.user.thumbSrc||"";return this.props.pages[r].thumbSrc||""}.bind(this),this.$PageVoiceDropdownSelector6=function(){var r=this.props.selectedActorID;if(!r)return"";if(r===this.props.user.id)return this.props.user.name||"";return this.props.pages[r].name||""}.bind(this),n}l.prototype.render=function(){var m=null;if(this.state.dialogShown)m=c("React").createElement(c("BootloadedComponent.react"),babelHelpers["extends"]({bootloadLoader:c("JSResource")("PageVoiceDropdownSelectorMenu.react").__setRef("PageVoiceDropdownSelector.react"),bootloadPlaceholder:c("React").createElement("div",null),onComponentLoad:this.$PageVoiceDropdownSelector3},this.props,{contextRef:this.$PageVoiceDropdownSelector2,shown:true,shownBusinessID:this.state.shownBusinessID,onChange:this.$PageVoiceDropdownSelector1,onToggle:this.$PageVoiceDropdownSelector4}));var n=this.state.dialogShown&&!this.state.bootloadFinished,o=this.props.loading||n,p=null,q=null;if(o)q=c("React").createElement("span",{className:"_2wk7"},c("React").createElement(c("XUISpinner.react"),null));else p=c("React").createElement(c("Image.react"),{className:"_6vg",height:16,src:this.$PageVoiceDropdownSelector5(),width:16});return c("React").createElement("span",null,c("React").createElement(c("XUIPopoverButton.react"),{"aria-label":this.props.ariaLabel,disabled:this.props.disabled,image:c("React").createElement("span",null,p,q),label:this.$PageVoiceDropdownSelector6(),labelIsHidden:!this.props.showPageName,maxwidth:this.props.maxwidth,ref:"open-menu-button",suppressed:this.props.suppressed,type:"button",onClick:this.$PageVoiceDropdownSelector7}),m)};l.propTypes={ariaLabel:k.string,disabled:k.bool,loading:k.bool,maxWidth:k.number,pages:k.object.isRequired,selectedActorID:k.string,showPageName:k.bool,suppressed:k.bool.isRequired,user:k.object.isRequired,onChange:k.func.isRequired,onClick:k.func.isRequired};l.defaultProps={disabled:false,showPageName:false};f.exports=l}),null);
__d("PagesCalloutActions",[],(function a(b,c,d,e,f,g){f.exports=Object.freeze({REGISTER_CALLOUT:"register_callout",INIT_SURFACE:"init_surface",SHOW_CALLOUT:"show_callout",DISMISS_CALLOUT:"dismiss_callout"})}),null);
__d("PagesCalloutDispatcher",["ExplicitRegistrationReactDispatcher"],(function a(b,c,d,e,f,g){"use strict";var h,i;h=babelHelpers.inherits(j,c("ExplicitRegistrationReactDispatcher"));i=h&&h.prototype;function j(k){i.constructor.call(this,k);this.dispatch=this.dispatch.bind(this)}f.exports=new j({strict:true})}),null);
__d("ActorSelector.react",["cx","Arbiter","BizSiteIdentifier.brands","BootloadedComponent.react","Bootloader","Event","JSResource","PagesCalloutActions","PagesCalloutDispatcher","PageVoiceDropdownSelector.react","React","ReactDOM","ShortProfiles","TooltipData","emptyFunction","getObjectValues","goURI","joinClasses","tidyEvent"],(function a(b,c,d,e,f,g,h){__p&&__p();var i,j,k=c("React").PropTypes,l=500;i=babelHelpers.inherits(m,c("React").Component);j=i&&i.prototype;function m(){__p&&__p();var n,o;"use strict";for(var p=arguments.length,q=Array(p),r=0;r<p;r++)q[r]=arguments[r];return o=(n=j.constructor).call.apply(n,[this].concat(q)),this.state={actorData:{},nuxShown:false,selectedActorID:this.props.selectedActorID},this.$ActorSelector4=function(){return this.refs.selector}.bind(this),this.$ActorSelector3=function(){c("ShortProfiles").getMulti(this.props.actorIDs,function(s){if(this.$ActorSelector2)this.setState({actorData:s})}.bind(this))}.bind(this),this.$ActorSelector9=function(){if(this.state.nuxShown)this.$ActorSelector5()}.bind(this),this.$ActorSelector8=function(s){if(this.props.syncEnabled){c("Arbiter").inform("ActorSelector/ActorChange",s);return}this.props.onChange(s)}.bind(this),this.$ActorSelector6=function(){this.$ActorSelector5();c("goURI")(this.props.settingsURI)}.bind(this),this.$ActorSelector5=function(){this.setState({nuxShown:false});if(this.props.onCompleteNux)this.props.onCompleteNux()}.bind(this),this.$ActorSelector11=function(){__p&&__p();if(!this.props.nuxEnabled)return;if(this.props.nuxHoverContext&&!this.$ActorSelector14)this.$ActorSelector14=c("tidyEvent")(c("Event").listen(this.props.nuxHoverContext,"mouseenter",function(){c("Bootloader").loadModules(["ActorSelectorNUXLayer.react"],c("emptyFunction"),"ActorSelector.react");var s=setTimeout(function(){this.$ActorSelector14.remove();this.$ActorSelector15()}.bind(this),l),t=c("tidyEvent")(c("Event").listen(this.props.nuxHoverContext,"mouseleave",function(){clearTimeout(s);t.remove()}))}.bind(this)))}.bind(this),this.$ActorSelector10=function(){if(!this.props.nuxEnabled||!this.props.pageTimelineNuxTipID)return;c("PagesCalloutDispatcher").dispatch({type:c("PagesCalloutActions").REGISTER_CALLOUT,data:{tip_id:this.props.pageTimelineNuxTipID,showCallback:function(){return this.$ActorSelector15()}.bind(this)}})}.bind(this),this.$ActorSelector15=function(){if(this.props.nuxEnabled)this.setState({nuxShown:true})}.bind(this),o}m.prototype.componentWillMount=function(){"use strict";this.$ActorSelector2=true;this.$ActorSelector3()};m.prototype.render=function(){"use strict";if(!this.state.selectedActorID||!this.state.actorData[this.state.selectedActorID])return c("React").createElement("div",null);if(this.props.actorIDs.length===0)return c("React").createElement("div",null);var n=null;if(this.state.nuxShown)n=c("React").createElement(c("BootloadedComponent.react"),{bootloadLoader:c("JSResource")("ActorSelectorNUXLayer.react").__setRef("ActorSelector.react"),bootloadPlaceholder:c("React").createElement("span",null),onCompleteNux:this.$ActorSelector5,onClickSettings:this.$ActorSelector6,settingsURI:this.props.settingsURI,shown:true,contextRef:this.$ActorSelector4,nuxBody:this.props.nuxBody});return c("React").createElement("span",{className:c("joinClasses")("_6vh",this.props.className),"data-testid":"actor-selector"},c("React").createElement("span",{ref:"selector"},c("React").createElement(c("PageVoiceDropdownSelector.react"),{ariaLabel:this.$ActorSelector7(),disabled:this.props.disabled,loading:this.props.loading,pages:this.state.actorData,onChange:this.$ActorSelector8,onClick:this.$ActorSelector9,selectedActorID:this.state.selectedActorID,searchBarVisible:true,showBusinessPages:false,showPageName:this.props.showName,showNameMaxWidth:this.props.showNameMaxWidth,showPersonalPagesInRoot:!c("BizSiteIdentifier.brands").isBizSite(),suppressed:this.props.suppressed,user:c("getObjectValues")(this.state.actorData)[0]})),n)};m.prototype.componentDidMount=function(){"use strict";this.$ActorSelector10();this.$ActorSelector11();this.$ActorSelector12();if(this.props.syncEnabled)this.$ActorSelector13()};m.prototype.componentDidUpdate=function(n,o){"use strict";__p&&__p();if(this.props.actorIDs.toString()!==n.actorIDs.toString())this.$ActorSelector3();this.$ActorSelector11();this.$ActorSelector12();if(this.state.nuxShown&&!o.nuxShown&&this.props.onShowNux)this.props.onShowNux();if(this.props.selectedActorID!==n.selectedActorID){this.setState({selectedActorID:this.props.selectedActorID});c("Arbiter").inform("ActorSelector/ActorSelected",{selectedActorID:this.props.selectedActorID})}};m.prototype.componentWillUnmount=function(){"use strict";this.$ActorSelector2=false;this.$ActorSelector1&&c("Arbiter").unsubscribe(this.$ActorSelector1)};m.prototype.$ActorSelector13=function(){"use strict";this.$ActorSelector1=c("Arbiter").subscribe("ActorSelector/ActorChange",function(n,o){if(this.props.actorIDs.indexOf(o.value)===-1)return;this.setState({selectedActorID:o.value},function(){return this.props.onChange(o)}.bind(this))}.bind(this))};m.prototype.$ActorSelector16=function(){"use strict";var n=this.state.actorData[this.state.selectedActorID];if(!n)return null;if(!this.props.tooltipConstructor)return null;return this.props.tooltipConstructor(n.name)};m.prototype.$ActorSelector7=function(){"use strict";var n=this.$ActorSelector16();if(!n)return null;return n.toString()};m.prototype.$ActorSelector12=function(){"use strict";if(!this.refs.selector)return;var n=this.$ActorSelector16();if(!n)return;c("TooltipData").set(c("ReactDOM").findDOMNode(this.refs.selector),n,"above","right")};m.propTypes={actorIDs:k.array.isRequired,disabled:k.bool,loading:k.bool,nuxBody:k.node,nuxEnabled:k.bool,nuxHoverContext:k.object,onChange:k.func.isRequired,onCompleteNux:k.func,onShowNux:k.func,pageTimelineNuxTipID:k.string,selectedActorID:k.string,settingsURI:k.string,showName:k.bool,showNameMaxWidth:k.number,suppressed:k.bool,syncEnabled:k.bool,tooltipConstructor:k.func};m.defaultProps={disabled:false,suppressed:true};f.exports=m}),null);
__d("LeftNavFitToHeight",["csx","cx","Bootloader","CSS","DOMQuery","DOMDimensions","Parent","Run","throttle"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j=null,k=null,l=false,m={fitIfOnlyOne:false,hasToolbar:false},n="fixed_elem",o={MIN_CHILDREN:1,MAX_CHILDREN:10,TOP_MARGIN:43,BOTTOM_MARGIN:78,TOOLBAR:45,init:function A(B,C){j=B;Object.assign(m,C);k=c("Parent").bySelector(j,"._1qkq > #pagelet_navigation");if(k){c("CSS").addClass(k,n);p();window.addEventListener("resize",p);c("Run").onLeave(o.destroy)}},destroy:function A(){if(k)c("CSS").removeClass(k,n);j=null;k=null;l=false;window.removeEventListener("resize",p)}},p=c("throttle")(function(){if(j&&!s(j))q(j)});function q(A){if(!l){l=true;c("Bootloader").loadModules(["LeftNavScrollable"],function(B){B.init(A)},"LeftNavFitToHeight")}}function r(A){var B=c("DOMQuery").scry(A,"#pinnedNav ul")[0],C=c("DOMQuery").scry(A,"#appsNav ul")[0];return{shortcutsContainer:B,exploreContainer:C}}function s(A){__p&&__p();var B=r(A),C=B.shortcutsContainer,D=B.exploreContainer,E=!!C+!!D;if(!v(A,C,D))return false;var F=y(C,D);if(!F)return false;var G=u(A,C,D),H=Math.floor(G/F),I=C?c("DOMQuery").scry(C,"li.sideNavItem"):[],J=D?c("DOMQuery").scry(D,"li.sideNavItem"):[],K=t(H,I.length,J.length),L=K.shortcutsCount,M=K.exploreCount,N="_3odl";I.forEach(function(O,P){c("CSS").conditionClass(O,N,P>=L)});J.forEach(function(O,P){c("CSS").conditionClass(O,N,P>=M)});if(H<o.MIN_CHILDREN*E)return false;return true}function t(A,B,C){var D=Math.max(Math.floor(A/2),o.MIN_CHILDREN);D=Math.min(D,B,o.MAX_CHILDREN);var E=Math.max(A-D,o.MIN_CHILDREN);E=Math.min(E,C,o.MAX_CHILDREN);return{exploreCount:E,shortcutsCount:D}}function u(A){for(var B=arguments.length,C=Array(B>1?B-1:0),D=1;D<B;D++)C[D-1]=arguments[D];var E=C.reduce(function(G,H){if(H!=null)return G+c("DOMDimensions").getElementDimensions(H).height;return G},0),F=c("DOMDimensions").getElementDimensions(A).height;return window.innerHeight-(F-E)-(o.TOP_MARGIN+(m.hasToolbar?o.TOOLBAR:0)+o.BOTTOM_MARGIN)}function v(A){for(var B=arguments.length,C=Array(B>1?B-1:0),D=1;D<B;D++)C[D-1]=arguments[D];return A&&c("DOMQuery").contains(window.document.body,A)&&w(C)}function w(A){if(m.fitIfOnlyOne)return A.find(function(B){return x(B)})!=null;return A.every(function(B){return x(B)})}function x(A){return A!=null&&c("CSS").matchesSelector(A,"._5pyq")}function y(){for(var A=arguments.length,B=Array(A),C=0;C<A;C++)B[C]=arguments[C];var D=z(B);if(D!=null)return c("DOMDimensions").getElementDimensions(D).height;return 0}function z(A){__p&&__p();var B="li.sideNavItem";for(var C=A,D=Array.isArray(C),E=0,C=D?C:C[typeof Symbol==="function"?Symbol.iterator:"@@iterator"]();;){var F;if(D){if(E>=C.length)break;F=C[E++]}else{E=C.next();if(E.done)break;F=E.value}var G=F;if(G!=null){var H=c("DOMQuery").scry(G,B)[0];if(H!=null)return H}}return null}f.exports=o}),18);
__d("ActorSelectorNuxTypes",[],(function a(b,c,d,e,f,g){f.exports=Object.freeze({COMPOSER:"composer_seen_count",COMPOSER_COVERED:"composer_covered_seen_count",M_COMPOSER:"m_composer_seen_count",M_UFI:"m_ufi_seen_count",UFI:"ufi_seen_count",UFI_TIMELINE:"ufi_timeline_seen_count",UFI_TIMELINE_COVERED:"ufi_timeline_covered_seen_count"})}),null);
__d("XActorSelectorNuxSeenWriteController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/actor_selector/nux/mark_seen/",{nux_type:{type:"Enum",required:true,enumType:1}})}),null);
__d("UFIActorSelector.react",["csx","fbt","ActorSelector.react","ActorSelectorNuxTypes","Arbiter","AsyncRequest","Parent","React","ReactDOM","SubscriptionsHandler","UFICentralUpdates","UFIFeedbackTargets","UFIUserActions","XActorSelectorNuxSeenWriteController","gkx"],(function a(b,c,d,e,f,g,h,i){"use strict";__p&&__p();var j,k,l=c("React").PropTypes,m=c("gkx")("AT7a3M_eoxpDzzqA-n7uVs6QnnJuHq2ZRvjyDt66BemqGNR1Uqfp3bGBt8Kts2I01N-2ZCCRuXnK6IgAOZlVj5F0")?c("React").PureComponent:c("React").Component,n="ufi_actor_selector_nux_disabled_event";j=babelHelpers.inherits(o,m);k=j&&j.prototype;function o(p){k.constructor.call(this,p);this.$UFIActorSelector3=function(s){this.setState({loading:true});c("UFIUserActions").changeActor(this.props.ftEntIdentifier,s.value)}.bind(this);this.$UFIActorSelector5=function(){var s=this.props.isTimeline?c("ActorSelectorNuxTypes").UFI_TIMELINE:c("ActorSelectorNuxTypes").UFI,t=c("XActorSelectorNuxSeenWriteController").getURIBuilder().setEnum("nux_type",s).getURI();new(c("AsyncRequest"))().setURI(t).send()}.bind(this);var q=c("UFIFeedbackTargets").getFeedbackTargetIfExists(this.props.ftEntIdentifier),r=q&&q.actorforpost;this.state={loading:!r,nuxEnabled:!!this.props.nuxEnabled,nuxHoverContext:null,selectedActorID:r||null}}o.prototype.render=function(){return c("React").createElement(c("ActorSelector.react"),{actorIDs:this.props.actorIDs,loading:this.props.loading||this.state.loading,nuxBody:this.$UFIActorSelector2(),nuxEnabled:this.state.nuxEnabled,nuxHoverContext:this.state.nuxHoverContext,onChange:this.$UFIActorSelector3,onShowNux:this.$UFIActorSelector4,onCompleteNux:this.$UFIActorSelector5,selectedActorID:this.state.selectedActorID,settingsURI:this.props.settingsURI,tooltipConstructor:this.$UFIActorSelector6,syncEnabled:this.props.syncEnabled})};o.prototype.componentDidMount=function(){__p&&__p();this.$UFIActorSelector7();this.$UFIActorSelector1=new(c("SubscriptionsHandler"))();this.$UFIActorSelector1.addSubscriptions(c("UFICentralUpdates").subscribe("feedback-updated",function(r,s){if(this.props.ftEntIdentifier in s.updates)this.$UFIActorSelector7()}.bind(this)),c("Arbiter").subscribe(n,function(){this.setState({nuxEnabled:false})}.bind(this)));if(this.state.nuxEnabled){var p=c("ReactDOM").findDOMNode(this);if(p){var q=c("Parent").bySelector(p,"._5pcr");if(q instanceof HTMLElement)this.setState({nuxHoverContext:q})}}};o.prototype.componentWillUnmount=function(){this.$UFIActorSelector1.release()};o.prototype.$UFIActorSelector7=function(){c("UFIFeedbackTargets").getFeedbackTarget(this.props.ftEntIdentifier,function(p){if(this.state.loading===false&&this.state.selectedActorID===p.actorforpost)return;this.setState({loading:false,selectedActorID:p.actorforpost})}.bind(this))};o.prototype.$UFIActorSelector2=function(){return i._("Like, comment or share as yourself or as one of the Pages you manage.")};o.prototype.$UFIActorSelector6=function(p){return i._("Liking and commenting as {actorName}",[i.param("actorName",p)])};o.prototype.$UFIActorSelector4=function(){c("Arbiter").inform(n)};o.propTypes={actorIDs:l.array.isRequired,ftEntIdentifier:l.string.isRequired,isTimeline:l.bool,loading:l.bool,nuxEnabled:l.bool,settingsURI:l.string,syncEnabled:l.bool};f.exports=o}),null);
__d("FeedReactComposerBootloadPerfTypedLogger",["Banzai","GeneratedLoggerUtils","nullthrows"],(function a(b,c,d,e,f,g){"use strict";__p&&__p();function h(){this.clear()}h.prototype.log=function(){c("GeneratedLoggerUtils").log("logger:FeedReactComposerBootloadPerfLoggerConfig",this.$FeedReactComposerBootloadPerfTypedLogger1,c("Banzai").BASIC)};h.prototype.logVital=function(){c("GeneratedLoggerUtils").log("logger:FeedReactComposerBootloadPerfLoggerConfig",this.$FeedReactComposerBootloadPerfTypedLogger1,c("Banzai").VITAL)};h.prototype.clear=function(){this.$FeedReactComposerBootloadPerfTypedLogger1={};return this};h.prototype.updateData=function(j){this.$FeedReactComposerBootloadPerfTypedLogger1=babelHelpers["extends"]({},this.$FeedReactComposerBootloadPerfTypedLogger1,j);return this};h.prototype.setBootloadDurationMillis=function(j){this.$FeedReactComposerBootloadPerfTypedLogger1.bootload_duration_millis=j;return this};h.prototype.setVC=function(j){this.$FeedReactComposerBootloadPerfTypedLogger1.vc=j;return this};var i={bootload_duration_millis:true,vc:true};f.exports=h}),null);
__d("FeedComposerIDStore",["Arbiter","ReactComposerEvents","SubscriptionsHandler"],(function a(b,c,d,e,f,g){"use strict";__p&&__p();var h={_composerID:null,_subscriptions:c("SubscriptionsHandler"),set:function i(j){this._subscriptions=new(c("SubscriptionsHandler"))();this._composerID=j;this._subscribeComposerResetEvent()},get:function i(){if(!this._composerID)throw new Error("ID Store has not yet been initialized via set()");return this._composerID},_subscribeComposerResetEvent:function i(){if(!this._composerID)throw new Error("Composer ID cannot be null");var j=c("Arbiter").subscribeOnce(c("ReactComposerEvents").COMPOSER_RESET+this._composerID,function(k,l){if(l&&l.newComposerID){this._composerID=l.newComposerID;this._subscribeComposerResetEvent()}}.bind(this));this._subscriptions.addSubscriptions(j)}};f.exports=h}),18);
__d("XReactFeedSproutsComposerXBootloadController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/react_composer/feedx_sprouts/bootload/",{composer_id:{type:"String",required:true},composer_type:{type:"Enum",required:true,enumType:1},friend_list_id:{type:"String"},target_id:{type:"String",required:true}})}),null);
__d("ReactFeedSproutsComposerX",["csx","cx","invariant","Arbiter","AsyncRequest","Bootloader","CSS","DOM","Event","FeedComposerIDStore","FeedReactComposerBootloadPerfTypedLogger","ReactComposerAttachmentType","ReactComposerEvents","ReactComposerFocusInit","Run","SubscriptionsHandler","XReactFeedSproutsComposerXBootloadController","$"],(function a(b,c,d,e,f,g,h,i,j){"use strict";__p&&__p();function k(l){__p&&__p();this.$ReactFeedSproutsComposerX26=function(o){o.preventDefault();c("CSS").addClass(this.$ReactFeedSproutsComposerX10,"_2-q9")}.bind(this);this.$ReactFeedSproutsComposerX27=function(o){o.preventDefault();c("CSS").removeClass(this.$ReactFeedSproutsComposerX10,"_2-q9")}.bind(this);this.$ReactFeedSproutsComposerX23=function(o){__p&&__p();var p=o.getTarget(),q=null;while(p){if(p.nodeType===1&&p.nodeName==="A"){q=p;break}p=p.parentNode}q!==null||j(0);var r=c("CSS").hasClass(q,"._5qtn");if(r)return;this.$ReactFeedSproutsComposerX11.forEach(function(q){return c("CSS").removeClass(q,"_5qtn")});c("CSS").addClass(q,"_5qtn");var s=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._559p"),t=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._559q");switch(q.getAttribute("data-attachment-type")){case c("ReactComposerAttachmentType").STATUS:c("CSS").hide(t);c("CSS").show(s);break;case c("ReactComposerAttachmentType").MEDIA:case c("ReactComposerAttachmentType").LIVE_VIDEO:c("CSS").show(t);c("CSS").hide(s);break;case c("ReactComposerAttachmentType").ALBUM:if(this.$ReactFeedSproutsComposerX9&&this.$ReactFeedSproutsComposerX9.albumTabUsesSelector)this.$ReactFeedSproutsComposerX28();break;case c("ReactComposerAttachmentType").POST_TO_GROUP:c("Bootloader").loadModules(["XReactComposerPostToGroupLoggingODSController","ReactComposerPostToGroupLoggingEvent"],function(u,v){var w=u.getURIBuilder().setString("event",v.CLICK_OUTER_TAB).getURI();new(c("AsyncRequest"))(w).send()},"ReactFeedSproutsComposerX");break}}.bind(this);this.$ReactFeedSproutsComposerX18=function(o){this.$ReactFeedSproutsComposerX29();if(this.$ReactFeedSproutsComposerX2)return;this.$ReactFeedSproutsComposerX17=Date.now();this.$ReactFeedSproutsComposerX2=true;var p=c("XReactFeedSproutsComposerXBootloadController").getURIBuilder().setString("composer_id",this.$ReactFeedSproutsComposerX3).setString("target_id",this.$ReactFeedSproutsComposerX15).setEnum("composer_type",this.$ReactFeedSproutsComposerX4).setString("friend_list_id",this.$ReactFeedSproutsComposerX6).getURI();new(c("AsyncRequest"))(p).send()}.bind(this);this.$ReactFeedSproutsComposerX22=function(){c("CSS").removeClass(this.$ReactFeedSproutsComposerX10,"_4qr4");c("CSS").addClass(this.$ReactFeedSproutsComposerX10,"_4a8c")}.bind(this);this.$ReactFeedSproutsComposerX21=function(){this.$ReactFeedSproutsComposerX22();this.$ReactFeedSproutsComposerX16.value="";c("CSS").removeClass(this.$ReactFeedSproutsComposerX10,"_2-q9")}.bind(this);this.$ReactFeedSproutsComposerX20=function(){this.$ReactFeedSproutsComposerX14.release()}.bind(this);this.$ReactFeedSproutsComposerX19=function(){c("Arbiter").inform(c("ReactComposerEvents").POST_SUCCEEDED+this.$ReactFeedSproutsComposerX3);this.$ReactFeedSproutsComposerX21()}.bind(this);this.$ReactFeedSproutsComposerX1=l.actorID;this.$ReactFeedSproutsComposerX10=l.root;this.$ReactFeedSproutsComposerX3=l.composerID;this.$ReactFeedSproutsComposerX15=l.targetID;this.$ReactFeedSproutsComposerX4=l.composerType;this.$ReactFeedSproutsComposerX6=l.friendListID;this.$ReactFeedSproutsComposerX7=l.largeTextThreshold;this.$ReactFeedSproutsComposerX9=l.gks;this.$ReactFeedSproutsComposerX8=false;this.$ReactFeedSproutsComposerX2=false;this.$ReactFeedSproutsComposerX5=c("DOM").find(this.$ReactFeedSproutsComposerX10,"form");this.$ReactFeedSproutsComposerX16=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._3en1");this.$ReactFeedSproutsComposerX13=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._16ve");c("FeedComposerIDStore").set(this.$ReactFeedSproutsComposerX3);this.$ReactFeedSproutsComposerX14=new(c("SubscriptionsHandler"))();this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(this.$ReactFeedSproutsComposerX16,"focus",this.$ReactFeedSproutsComposerX18),c("Event").listen(this.$ReactFeedSproutsComposerX10,"click",this.$ReactFeedSproutsComposerX18),c("Event").listen(this.$ReactFeedSproutsComposerX5,"success",this.$ReactFeedSproutsComposerX19),c("Arbiter").subscribeOnce("ReactFeedComposerXBootloader/bootload/"+this.$ReactFeedSproutsComposerX3,function(){new(c("FeedReactComposerBootloadPerfTypedLogger"))().setBootloadDurationMillis(Date.now()-this.$ReactFeedSproutsComposerX17).log();this.$ReactFeedSproutsComposerX20()}.bind(this)),c("Arbiter").subscribeOnce("ReactFeedComposerXBootloader/selectcomposer/"+this.$ReactFeedSproutsComposerX3,this.$ReactFeedSproutsComposerX18),c("Arbiter").subscribe("ReactComposerFocus/reset/"+this.$ReactFeedSproutsComposerX3,this.$ReactFeedSproutsComposerX21),c("Arbiter").subscribe("ReactComposerFocus/collapse/"+this.$ReactFeedSproutsComposerX3,this.$ReactFeedSproutsComposerX22),c("Arbiter").subscribe(c("ReactComposerEvents").TEXT_PREFILL_BEFORE_BOOTLOAD+this.$ReactFeedSproutsComposerX3,function(o,p){this.$ReactFeedSproutsComposerX16.value=p;this.$ReactFeedSproutsComposerX16.selectionEnd=0}.bind(this)),c("Arbiter").subscribe("ReactFeedSproutsComposerXBody/onDrop",this.$ReactFeedSproutsComposerX18));this.$ReactFeedSproutsComposerX11=c("DOM").scry(this.$ReactFeedSproutsComposerX10,"._4-h7");this.$ReactFeedSproutsComposerX11.forEach(function(o){return this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(o,"click",this.$ReactFeedSproutsComposerX23))}.bind(this));this.$ReactFeedSproutsComposerX12=c("DOM").scry(this.$ReactFeedSproutsComposerX10,"._m_1");if(this.$ReactFeedSproutsComposerX9&&this.$ReactFeedSproutsComposerX9.prefillSprouts)this.$ReactFeedSproutsComposerX12.forEach(function(o){return this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(o,"click",function(){this.$ReactFeedSproutsComposerX24(o)}.bind(this)))}.bind(this));var m=c("DOM").scry(this.$ReactFeedSproutsComposerX10,"._2mo4");if(m.length===1)this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(m[0],"click",function(){if(this.$ReactFeedSproutsComposerX8)return;this.$ReactFeedSproutsComposerX8=true;c("Arbiter").subscribeOnce("ReactFeedComposerXBootloader/bootload/"+this.$ReactFeedSproutsComposerX3,function(o,p){c("Bootloader").loadModules(["LiveVideoBroadcastUtils"],function(q){q.startPreviewUI(p.contextConfig,p.config);this.$ReactFeedSproutsComposerX8=false}.bind(this),"ReactFeedSproutsComposerX")}.bind(this));c("Bootloader").loadModules(["LiveVideoBroadcastUtils"],function(){},"ReactFeedSproutsComposerX")}.bind(this)));if(this.$ReactFeedSproutsComposerX9&&this.$ReactFeedSproutsComposerX9.sharingSpacesDestinationPicker)this.$ReactFeedSproutsComposerX25();var n=l.reactComposerFocusExtraConfigData;if(n&&n.showDialogForP2PAdminsMetadata&&n.showDialogForP2PAdminsMetadata.showDialogForP2PAdmins&&l.jsModules.P2PNewAdminComposerFocus)c("ReactComposerFocusInit").handler(c("$")("feedx_sprouts_container"),this.$ReactFeedSproutsComposerX3,this.$ReactFeedSproutsComposerX1,this.$ReactFeedSproutsComposerX9,l.jsModules.P2PNewAdminComposerFocus,false,l.reactComposerFocusExtraConfigData);else if(l.jsModules&&l.jsModules.composerFocus)c("ReactComposerFocusInit").handler(c("$")("feedx_sprouts_container"),this.$ReactFeedSproutsComposerX3,this.$ReactFeedSproutsComposerX1,this.$ReactFeedSproutsComposerX9,l.jsModules.composerFocus,false,l.reactComposerFocusExtraConfigData);c("Run").onLeave(this.$ReactFeedSproutsComposerX20)}k.prototype.$ReactFeedSproutsComposerX28=function(){var l=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._559p"),m=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._559q");c("Arbiter").subscribeOnce("ReactFeedComposerXBootloader/bootload/"+this.$ReactFeedSproutsComposerX3,function(){c("Bootloader").loadModules(["ReactComposerCollectionsActions","ReactComposerLoggingName"],function(n,o){n.showCollectionsSelector(this.$ReactFeedSproutsComposerX3,o.ALBUM_TAB_SELECTOR)}.bind(this),"ReactFeedSproutsComposerX");this.$ReactFeedSproutsComposerX20()}.bind(this));c("CSS").show(m);c("CSS").hide(l)};k.prototype.$ReactFeedSproutsComposerX24=function(l,m){var n=l.getAttribute("data-sprout-tagger-id");if(n){var o=c("DOM").find(this.$ReactFeedSproutsComposerX13,"._16vl"),p=c("DOM").find(o,'*[data-sprout-tagger-id="'+n+'"]');c("CSS").addClass(p,"_30lm");this.$ReactFeedSproutsComposerX13.setAttribute("data-selected-sprout-id",n)}};k.prototype.$ReactFeedSproutsComposerX25=function(){var l=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._1-pl");this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(l,"click",this.$ReactFeedSproutsComposerX26));var m=c("DOM").find(this.$ReactFeedSproutsComposerX10,"._1-pm");this.$ReactFeedSproutsComposerX14.addSubscriptions(c("Event").listen(m,"click",this.$ReactFeedSproutsComposerX27))};k.prototype.$ReactFeedSproutsComposerX29=function(){c("CSS").addClass(this.$ReactFeedSproutsComposerX10,"_4qr4");c("CSS").removeClass(this.$ReactFeedSproutsComposerX10,"_4a8c")};f.exports=k}),null);
__d("AsyncData",[],(function a(b,c,d,e,f,g){__p&&__p();var h=Object.create(null),i=Object.create(null),j=Object.create(null),k={resolve:function n(o,p){var q=j[o]={result:p,status:"success"};if(h[o]){h[o].forEach(function(r){return r(q.result)});delete h[o]}delete i[o]},reject:function n(o,p){var q=j[o]={error:p,status:"error"};if(i[o]){i[o].forEach(function(r){return r(q.error)});delete i[o]}delete h[o]},preload:function n(o){var p={};p.onLoaded=l.bind(null,o,p);p.onError=m.bind(null,o,p);return p}};function l(n,o,p){var q=j[n];if(q&&!q.error)p(q.result);else{h[n]=h[n]||[];h[n].push(p)}return o}function m(n,o,p){var q=j[n];if(q){if(q.status==="error")p(q.error)}else{i[n]=i[n]||[];i[n].push(p)}return o}f.exports=k}),null);
__d("AsyncDataPreloader",["AsyncData"],(function a(b,c,d,e,f,g){__p&&__p();function h(i){var j=i.id;"use strict";this.$AsyncDataPreloader1=j;this.$AsyncDataPreloader2=c("AsyncData").preload.call(null,this.$AsyncDataPreloader1)}h.prototype.onLoaded=function(i){"use strict";this.$AsyncDataPreloader2.onLoaded(i);return this};h.prototype.onError=function(i){"use strict";this.$AsyncDataPreloader2.onError(i);return this};f.exports=h}),null);
__d("range",[],(function a(b,c,d,e,f,g){function h(i,j,k){k=!k?i<j?1:-1:k;var l=-1,m=Math.max(Math.ceil((j-i)/k),0),n=Array(m);while(m--){n[++l]=i;i+=k}return n}f.exports=h}),null);