if (self.CavalryLogger) { CavalryLogger.start_js(["TSpx4"]); }

__d("ContextualHelpSearchController",["Event","AsyncRequest","DOM","CSS","Focus","Input"],(function a(b,c,d,e,f,g){__p&&__p();var h=400;function i(j,k,l,m,n,o){__p&&__p();this._token=null;this._timerID=0;this._lastQuery=null;this.loader=j;this.search_box=k;this.topics_area=l;this.results_area=m;this.clear_button=n;this.typing_listener=c("Event").listen(this.search_box,"keyup",this.setTimer.bind(this));this.clear_listener=c("Event").listen(this.clear_button,"click",this.clearResults.bind(this));if(o==null||o.focusSearchBox==null||o.focusSearchBox)c("Focus").set(this.search_box);this.async_request=null}Object.assign(i.prototype,{source:"contextual_help",clearResults:function j(){this.show(this.topics_area);this._lastQuery="";c("Input").reset(this.search_box);c("Focus").set(this.search_box);if(this.async_request!==null){this.async_request.abort();this.async_request=null}c("CSS").addClass(this.clear_button,"hidden_elem")},update:function j(){__p&&__p();var k=c("Input").getValue(this.search_box);if(k===this._lastQuery)return;this._lastQuery=k;if(k===""){this.clearResults();return}this.show(this.loader);var l={query:k,width:this._width||h,source:this.source};this.async_request=new(c("AsyncRequest"))("/help/ajax/search/").setData(l).setHandler(function(m){this._update(m)}.bind(this));this.async_request.send()},_update:function j(k){this.async_request=null;var l=k.getPayload().results;c("DOM").setContent(this.results_area,l);this.show(this.results_area);if(c("Input").getValue(this.search_box)==="")this.clearResults();else c("CSS").removeClass(this.clear_button,"hidden_elem")},setTimer:function j(){if(this._timerID!==0)clearTimeout(this._timerID);this._timerID=setTimeout(this.update.bind(this),300);if(this.async_request!=null){this.async_request.abort();this.async_request=null}},show:function j(k){var l=[this.loader,this.topics_area,this.results_area];for(var m=0;m<l.length;m++)c("CSS").addClass(l[m],"hidden_elem");c("CSS").removeClass(k,"hidden_elem")}});f.exports=i}),null);
__d("PrivacyLiteFlyoutHelp",["csx","cx","Arbiter","AsyncRequest","Banzai","ContextualHelpSearchController","CSS","DOM","Event","Parent"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j,k;function l(m,n,o,p,q){__p&&__p();this._width=315;k=c("DOM").find(n,"input");var r=c("DOM").create("div");c("ContextualHelpSearchController").call(this,m,k,r,o,p,{focusSearchBox:false});j=c("Parent").bySelector(n,"._8-a");c("Event").listen(q,"click",function(){this._hideSearch(this);c("Banzai").post("privacy_lite",{event:"plite_search_collapse",exit_point:null})}.bind(this));c("Arbiter").subscribe("PrivacyLiteFlyout/expandingSection",this._hideSearch.bind(this));var s=c("DOM").scry(j,"._d1r")[0];s&&c("Event").listen(s,"click",function(){c("CSS").addClass(j,"_aw6");k.focus();c("Banzai").post("privacy_lite",{event:"plite_search_expand",exit_point:null});if(!this.suggestedResults)new(c("AsyncRequest"))("/ajax/privacy/privacy_lite/help_suggestions").setHandler(function(t){var u=t.getPayload().searchSuggestions,v=c("DOM").find(j,"._4_8m");c("DOM").setContent(v,u);c("CSS").addClass(j,"_4_8l")}.bind(this)).send()}.bind(this))}Object.assign(l.prototype,c("ContextualHelpSearchController").prototype,{source:"privacy_shortcuts",_hideSearch:function m(){this.clearResults();c("CSS").removeClass(j,"_aw6")},show:function m(n){__p&&__p();if(n===this.topics_area){c("CSS").removeClass(j,"_aw7");return}else if(n===this.loader){c("CSS").addClass(j,"_aw7");c("CSS").hide(this.results_area)}else c("CSS").hide(this.loader);c("CSS").show(n)}});f.exports=l}),null);
__d("HelpCenterReferrer",[],(function a(b,c,d,e,f,g){f.exports=Object.freeze({HELP_CENTER_FOLDER_NAV:"hc_fnav",HELP_CENTER_GLOBAL_NAV:"hc_global_nav",FACEBAR_DROPDOWN:"facebar_dropdown",FACEBAR_DROPDOWN_HELP:"facebar_dropdown_help",BREADCRUMB:"breadcrumb",HEADER_BACK:"header_back",TOP_QUESTIONS:"topq",POPULAR_TOPICS:"popular_topics",NFX:"nfx",REF_KEY:"helpref",SEARCH:"search",M_SEARCH:"m-search",PLATFORM_SWITCHER:"platform_switcher",UF_PERMALINK:"uf_permalink",UF_SHARE:"uf_share",UF_REDIRECT:"uf_redirect",RELATED:"related",HELP_WIZARD:"help_wizard",PI_PROMOTE_PAGE_TIP:"pi_promote_page_tip"})}),null);
__d("XContextualHelpFAQBodyController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/support/help/contextual/faq_body/",{cms_id:{type:"Int",required:true},helpref:{type:"Enum",enumType:1},query:{type:"String"},sr:{type:"Int"}})}),null);
__d("ContextualHelpFAQ.react",["cx","fbt","AsyncRequest","HelpCenterReferrer","Link.react","React","URI","XContextualHelpFAQBodyController","XContextualHelpUFController","XUISpinner.react"],(function a(b,c,d,e,f,g,h,i){"use strict";__p&&__p();var j,k;j=babelHelpers.inherits(l,c("React").Component);k=j&&j.prototype;function l(m){k.constructor.call(this,m);this.isFAQRequested=false;this.state={faq:null,universalFeedback:null}}l.prototype.$ContextualHelpFAQ1=function(){if(this.isFAQRequested)return;this.isFAQRequested=true;var m=c("XContextualHelpFAQBodyController").getURIBuilder().setInt("cms_id",this.props.cmsID).setEnum(c("HelpCenterReferrer").REF_KEY,this.props.helpRef).setString("query",this.props.query).setInt("sr",this.props.rank).getURI();new(c("AsyncRequest"))(m).setHandler(function(n){return this.setState({faq:n.getPayload().faq})}.bind(this)).send()};l.prototype.$ContextualHelpFAQ2=function(){var m=c("XContextualHelpUFController").getURIBuilder().setInt("cms_id",this.props.cmsID).getURI();new(c("AsyncRequest"))(m).setHandler(function(n){return this.setState({universalFeedback:n.getPayload().universal_feedback})}.bind(this)).send()};l.prototype.componentDidMount=function(){this.$ContextualHelpFAQ2()};l.prototype.render=function(){__p&&__p();var m=null;if(this.props.isExpanded){this.$ContextualHelpFAQ1();if(this.state.faq===null)m=c("React").createElement(c("XUISpinner.react"),null);else{var n,o=this.props.useWorkHelpCenter?"/help/work/":"/help/",p=new(c("URI"))(o+this.props.cmsID).addQueryData((n={},n[c("HelpCenterReferrer").REF_KEY]=this.props.helpRef,n.query=this.props.query,n.sr=this.props.rank,n.ref="contextual",n));m=c("React").createElement("div",null,c("React").createElement("div",{className:"_3-95",dangerouslySetInnerHTML:this.state.faq}),c("React").createElement(c("Link.react"),{href:p},i._("View in Help Center")))}}return c("React").createElement("div",{className:!this.props.isExpanded?"_4w3i":""},m,this.$ContextualHelpFAQ3())};l.prototype.$ContextualHelpFAQ3=function(){if(this.state.universalFeedback===null)return c("React").createElement("div",null);return c("React").createElement("div",{className:"_50wr"+(this.state.faq===null?" _4w3i":""),dangerouslySetInnerHTML:this.state.universalFeedback})};f.exports=l}),null);
__d("XContextualHelpFAQNamesController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/support/help/contextual/faq_names/",{cms_ids:{type:"StringVector",required:true}})}),null);
__d("ContextualHelpFAQList.react",["ix","cx","AsyncRequest","ContextualHelpFAQ.react","Image.react","Link.react","React","XContextualHelpFAQNamesController","XUISpinner.react","fbglyph"],(function a(b,c,d,e,f,g,h,i){__p&&__p();var j,k,l=c("React").PropTypes,m=-1;j=babelHelpers.inherits(n,c("React").Component);k=j&&j.prototype;function n(o){"use strict";k.constructor.call(this,o);this.state={faqIDToName:{},selectedFAQ:m}}n.prototype.componentDidMount=function(){"use strict";var o=c("XContextualHelpFAQNamesController").getURIBuilder().setStringVector("cms_ids",this.props.cmsIDs).getURI();new(c("AsyncRequest"))(o).setHandler(function(p){return this.setState({faqIDToName:p.getPayload()})}.bind(this)).send()};n.prototype.render=function(){"use strict";if(!Object.keys(this.state.faqIDToName).length)return c("React").createElement(c("XUISpinner.react"),{className:"_5va9"});return c("React").createElement("ul",null,this.$ContextualHelpFAQList1(),this.$ContextualHelpFAQList2())};n.prototype.$ContextualHelpFAQList1=function(){"use strict";return this.props.cmsIDs.map(function(o,p){return this.state.faqIDToName[o]===undefined?null:c("React").createElement("li",{className:"_yw6",key:"faq_"+p},this.$ContextualHelpFAQList3(o,p))}.bind(this))};n.prototype.$ContextualHelpFAQList3=function(o,p){"use strict";var q=void 0,r=this.state.selectedFAQ===p;if(r)q=c("React").createElement(c("Image.react"),{className:"_5vad",src:h("125822")});else q=c("React").createElement(c("Image.react"),{className:"_5vad",src:h("125792")});return c("React").createElement("div",null,c("React").createElement(c("Link.react"),{className:"clearfix _yw7"+(r?" _5vae":""),onClick:function(){return this.$ContextualHelpFAQList4(p)}.bind(this),role:"button"},c("React").createElement("div",{className:"_5vaf"},this.state.faqIDToName[o]),q),c("React").createElement("div",{className:"_4x8y"},c("React").createElement(c("ContextualHelpFAQ.react"),{cmsID:o,isExpanded:r,useWorkHelpCenter:this.props.useWorkHelpCenter,helpRef:this.props.helpRef,query:this.props.query,rank:this.props.query?p+1:undefined})))};n.prototype.$ContextualHelpFAQList2=function(){"use strict";if(!(this.props.seeMoreLinkText&&this.props.seeMoreLinkHref))return null;return c("React").createElement("li",{className:"_yw6"},c("React").createElement(c("Link.react"),{className:"_54t9",href:this.props.seeMoreLinkHref+"?ref=contextual"},c("React").createElement("div",{className:"_2-o9"},this.props.seeMoreLinkText),c("React").createElement("div",{className:"_54ta"})))};n.prototype.$ContextualHelpFAQList4=function(o){"use strict";this.setState({selectedFAQ:o===this.state.selectedFAQ?m:o})};n.propTypes={cmsIDs:l.arrayOf(l.string).isRequired,seeMoreLinkHref:l.string,seeMoreLinkText:l.string,useWorkHelpCenter:l.bool.isRequired,helpRef:l.string,query:l.string};f.exports=n}),null);
__d("XHelpCenterSearchController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/support/help/search/",{query:{type:"String",required:true}})}),null);
__d("ContextualHelpSearch.react",["ix","cx","fbt","AsyncRequest","ContextualHelpFAQList.react","HelpCenterReferrer","Image.react","Link.react","React","URI","XHelpCenterSearchController","XUICloseButton.react","XUISpinner.react","XUITextInput.react","fbglyph"],(function a(b,c,d,e,f,g,h,i,j){"use strict";__p&&__p();var k,l,m=c("React").PropTypes,n=3;k=babelHelpers.inherits(o,c("React").Component);l=k&&k.prototype;function o(){__p&&__p();var p,q;for(var r=arguments.length,s=Array(r),t=0;t<r;t++)s[t]=arguments[t];return q=(p=l.constructor).call.apply(p,[this].concat(s)),this.state={cmsIDs:[],query:"",responseReceived:false},this.$ContextualHelpSearch1=function(u){var v=u.target.value;if(v.length===0)this.$ContextualHelpSearch8();else{this.setState({query:v,responseReceived:v.length>0&&v.length<n});this.$ContextualHelpSearch9(v)}}.bind(this),this.$ContextualHelpSearch8=function(){this.setState({cmsIDs:[],query:""})}.bind(this),q}o.prototype.componentDidUpdate=function(p,q){if(q.query.length!==0&&this.state.query.length===0)this.props.setSearchActive(false);if(this.state.query.length>0&&q.query.length===0)this.props.setSearchActive(true)};o.prototype.render=function(){var p=j._("How can we help?");return c("React").createElement("div",null,c("React").createElement("div",{className:"_3fzq"},c("React").createElement("div",null,c("React").createElement(c("XUITextInput.react"),{className:"_3fzr",height:"tall",placeholder:p,value:this.state.query,onChange:this.$ContextualHelpSearch1})),c("React").createElement("div",{className:"_14l6"},this.$ContextualHelpSearch2())),c("React").createElement("ul",null,this.$ContextualHelpSearch3(),this.$ContextualHelpSearch4()))};o.prototype.$ContextualHelpSearch3=function(){if(this.$ContextualHelpSearch5())return null;if(this.$ContextualHelpSearch6())return c("React").createElement("li",{className:"_3-8j"},j._("No Results Found"));if(this.$ContextualHelpSearch7())return c("React").createElement("li",null,c("React").createElement(c("XUISpinner.react"),{className:"_5bh_"}));return c("React").createElement(c("ContextualHelpFAQList.react"),{cmsIDs:this.state.cmsIDs,useWorkHelpCenter:this.props.useWorkHelpCenter,helpRef:c("HelpCenterReferrer").SEARCH,query:this.state.query})};o.prototype.$ContextualHelpSearch4=function(){if(this.$ContextualHelpSearch5()||this.$ContextualHelpSearch7())return null;if(this.$ContextualHelpSearch6()){var p=this.props.useWorkHelpCenter?"/help/work/?ref=contextual":"/help/?ref=contextual";return c("React").createElement("div",{className:"_3cql"},c("React").createElement("div",{className:"_5mbv"},j._("HAVE A QUESTION?")),c("React").createElement(c("Link.react"),{href:p,target:"_blank"},j._("Browse the Help Center")),c("React").createElement(c("Image.react"),{className:"_3cqm",src:h("126914")}))}var q=this.props.useWorkHelpCenter?"/help/work/search":"/help/search",r=new(c("URI"))(q).addQueryData({query:this.state.query,ref:"contextual"});return c("React").createElement("li",null,c("React").createElement(c("Link.react"),{className:"_3cql",href:r},j._("See more about {query}",[j.param("query",' "'+this.state.query+'"')]),c("React").createElement(c("Image.react"),{className:"_3cqm",src:h("126914")})))};o.prototype.$ContextualHelpSearch2=function(){if(this.state.query)return c("React").createElement(c("XUICloseButton.react"),{className:"_3fzs",onClick:this.$ContextualHelpSearch8});return c("React").createElement(c("Image.react"),{className:"_3fzs",src:h("142454")})};o.prototype.$ContextualHelpSearch9=function(p){if(p.length<n)return;var q=c("XHelpCenterSearchController").getURIBuilder().setString("query",p).getURI();new(c("AsyncRequest"))(q).setHandler(function(r){if(p===this.state.query)this.setState({cmsIDs:r.getPayload().cmsIDs,responseReceived:true})}.bind(this)).send()};o.prototype.$ContextualHelpSearch7=function(){return this.state.query.length>0&&!this.state.responseReceived};o.prototype.$ContextualHelpSearch6=function(){return this.state.responseReceived&&this.state.cmsIDs.length===0||this.state.query.length<n};o.prototype.$ContextualHelpSearch5=function(){return this.state.query.length===0};o.propTypes={setSearchActive:m.func.isRequired,useWorkHelpCenter:m.bool.isRequired};f.exports=o}),null);
__d("WorkCompanyDashboardReferrer",[],(function a(b,c,d,e,f,g){f.exports=Object.freeze({BOOKMARKS:"bookmarks",INSIGHTS_SUMMARY_EMAIL:"insights_summary_email",TOPBAR_LINK:"topbar_link",TOPBAR_MENU:"topbar_menu",NOTIF:"notif",LAUNCH_REMINDER:"launch_reminder",RHC_UNIT_ADD_PEOPLE_BUTTON:"rhc_unit_add_people_button",RHC_SUBDOMAIN_UPSELL:"rhc_subdomain_upsell",IDP_UPSELL_QP:"idp_upsell_qp",ADMIN_ACTIONS_ADD_PEOPLE:"work_goal_inline",LHC_ADD_PEOPLE_DIALOG:"bookmarks_www",CONTEXTUAL_HELP_NAV:"contextual",UPGRADE_WELCOME_DIALOG:"upgrade_welcome_dialog"})}),null);
__d("XReportWorkIssueDialogController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/work/async/feedback_dialog/",{ref:{type:"String"},__asyncDialog:{type:"Int"}})}),null);
__d("ContextualHelpNav.react",["ix","cx","fbt","AsyncDialog","AsyncRequest","ContextualHelpFAQList.react","ContextualHelpSearch.react","CurrentUser","Grid.react","HelpLiteFlyout","HelpCenterReferrer","Image.react","Link.react","React","WorkAdminSection","WorkCompanyDashboardReferrer","XAtWorkAdminPanelController","XPrivacyCheckupSpawnDialogController","XReportWorkIssueDialogController","XUIBadge.react","XUIButton.react","fbglyph"],(function a(b,c,d,e,f,g,h,i,j){__p&&__p();var k,l,m=c("React").PropTypes,n="XXXNOT_SELECTEDXXX";k=babelHelpers.inherits(o,c("React").Component);l=k&&k.prototype;function o(){var p,q;"use strict";for(var r=arguments.length,s=Array(r),t=0;t<r;t++)s[t]=arguments[t];return q=(p=l.constructor).call.apply(p,[this].concat(s)),this.state={isSearchActive:false,searchUpdateKey:0,selectedTopic:n},this.$ContextualHelpNav22=function(){this.setState({isSearchActive:false,searchUpdateKey:this.state.searchUpdateKey+1,selectedTopic:n})}.bind(this),q}o.prototype.render=function(){"use strict";return c("React").createElement("div",{className:"_yv-",style:{maxHeight:Math.max(window.innerHeight-100,100)}},this.$ContextualHelpNav1(),c("React").createElement(c("ContextualHelpSearch.react"),{key:this.state.searchUpdateKey,setSearchActive:function(p){return this.setState({isSearchActive:p})}.bind(this),useWorkHelpCenter:this.props.workUserParams.useWorkHelpCenter}),this.$ContextualHelpNav2(),this.$ContextualHelpNav3(),this.$ContextualHelpNav4())};o.prototype.$ContextualHelpNav2=function(){"use strict";if(this.state.selectedTopic!==n||this.state.isSearchActive)return null;return c("React").createElement("div",{className:"_2o8x"},j._("HELP WITH THIS PAGE"))};o.prototype.$ContextualHelpNav4=function(){"use strict";if(!this.$ContextualHelpNav5())return null;return c("React").createElement("div",{className:"_1guv"},c("React").createElement("div",{className:"_n20"}),this.$ContextualHelpNav6(),this.$ContextualHelpNav7(),this.$ContextualHelpNav8(),this.props.workUserParams.canContactSupport&&c("React").createElement("div",{className:"_n20"}),this.$ContextualHelpNav9(),this.$ContextualHelpNav10(),this.$ContextualHelpNav11())};o.prototype.$ContextualHelpNav11=function(){"use strict";if(this.props.workUserParams.useWorkHelpCenter===true&&!c("CurrentUser").isEmployee()){if(!this.props.workUserParams.canContactSupport)return c("React").createElement("div",null,this.$ContextualHelpNav12(),this.$ContextualHelpNav13());return this.$ContextualHelpNav12()}return this.$ContextualHelpNav13()};o.prototype.$ContextualHelpNav13=function(){"use strict";var p="/help/ajax/report_a_problem",q=j._("Report a Problem");if(this.props.workUserParams.useWorkHelpCenter===true&&!c("CurrentUser").isEmployee()){p="/ajax/bugs/report";q=j._("Report a Problem to Workplace")}return c("React").createElement(c("Link.react"),{className:"_s39",href:p,rel:"dialog"},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123502")}),c("React").createElement("div",{className:"_n22"},q)))};o.prototype.$ContextualHelpNav12=function(){"use strict";return c("React").createElement(c("Link.react"),{className:"_s39",href:"/help/work/contact/391303461060861/"},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123499")}),c("React").createElement("div",{className:"_n22"},j._("Send Feedback to Workplace"))))};o.prototype.$ContextualHelpNav8=function(){"use strict";__p&&__p();var p=this.props.workUserParams,q=p.useWorkHelpCenter,r=p.canContactSupport,s=p.canAccessDirectSupport;if(q&&!r||s)return null;var t=null,u=j._("Support Inbox"),v=2;if(this.props.numMessages>0){t=c("React").createElement(c("XUIBadge.react"),{className:"_5e9k",count:this.props.numMessages,maxcount:99});u=j._("New Support Messages")}return c("React").createElement(c("Link.react"),{className:"_s39 clearfix",href:"/support?ref=contextual"},c("React").createElement(c("Grid.react"),{cols:v,alignv:"top",className:"_-z4"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("122843")}),c("React").createElement("div",{className:"_n22"},u)),t)};o.prototype.$ContextualHelpNav9=function(){"use strict";if(!this.props.workUserParams.useWorkHelpCenter)return null;return c("React").createElement(c("Link.react"),{className:"_s39",href:"/help/work/?ref=contextual"},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123478")}),c("React").createElement("div",{className:"_n22"},j._("Help Center"))))};o.prototype.$ContextualHelpNav14=function(){"use strict";c("HelpLiteFlyout").setFlyoutVisible(false);c("AsyncDialog").send(new(c("AsyncRequest"))(c("XPrivacyCheckupSpawnDialogController").getURIBuilder().setEnum("source","plite").getURI()))};o.prototype.$ContextualHelpNav15=function(){"use strict";if(!this.props.showPrivacyCheckup)return null;return c("React").createElement(c("Link.react"),{className:"_s39",href:"#",onClick:this.$ContextualHelpNav14},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123223")}),c("React").createElement("div",{className:"_n22"},j._("Privacy Checkup"))))};o.prototype.$ContextualHelpNav16=function(){"use strict";return c("React").createElement(c("Link.react"),{"data-testid":"privacy_lite_jewel_button",className:"_s39",href:"#",onClick:c("HelpLiteFlyout").openPrivacy},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123028")}),c("React").createElement("div",{className:"_n22"},j._("Privacy Shortcuts"))))};o.prototype.$ContextualHelpNav6=function(){"use strict";if(this.props.workUserParams.useWorkHelpCenter)return null;return c("React").createElement("div",null,this.$ContextualHelpNav15(),this.$ContextualHelpNav16(),c("React").createElement("div",{className:"_n20"}))};o.prototype.$ContextualHelpNav10=function(){"use strict";if(!this.props.workUserParams.showWorkCommunityLink)return null;return c("React").createElement(c("Link.react"),{className:"_s39",href:"/help/work/community/?ref=contextual",target:"_blank"},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("122972")}),c("React").createElement("div",{className:"_n22"},j._("Ask the Help Community"))))};o.prototype.$ContextualHelpNav7=function(){"use strict";if(!this.props.workUserParams.canContactSupport)return null;var p=c("XAtWorkAdminPanelController").getURIBuilder().setEnum("section",c("WorkAdminSection").DIRECT_SUPPORT).setEnum("ref",c("WorkCompanyDashboardReferrer").CONTEXTUAL_HELP_NAV).getURI(),q=this.props.workUserParams.isAdmin?this.props.workUserParams.canAccessDirectSupport?p:"/help/work/contact/1055205077836390/?ref=contextual":"/help/work/contact/105162420005429/?ref=contextual";return c("React").createElement(c("Link.react"),{className:"_s39",href:q,target:"_blank"},c("React").createElement(c("Grid.react"),{cols:2,alignv:"top"},c("React").createElement(c("Image.react"),{className:"_n21",src:h("123247")}),c("React").createElement("div",{className:"_n22"},j._("Contact Workplace Support"))))};o.prototype.$ContextualHelpNav3=function(){"use strict";if(this.state.isSearchActive)return null;return this.state.selectedTopic===n?this.$ContextualHelpNav17():this.$ContextualHelpNav18()};o.prototype.$ContextualHelpNav1=function(){"use strict";if(this.state.selectedTopic===n&&!this.state.isSearchActive)return this.$ContextualHelpNav19();return this.$ContextualHelpNav20()};o.prototype.$ContextualHelpNav17=function(){"use strict";return c("React").createElement("ul",{className:"_43uh"},Object.keys(this.props.tree).map(function(p,q){return c("React").createElement("li",{key:q},c("React").createElement(c("Link.react"),{className:"_yw7 _s3a clearfix",key:"li_"+q,onClick:function(){return this.$ContextualHelpNav21(p)}.bind(this),role:"button"},c("React").createElement("div",{className:"_5vaf"},p),c("React").createElement(c("Image.react"),{className:"_s3b",src:h("126914")})))}.bind(this)))};o.prototype.$ContextualHelpNav18=function(){"use strict";var p=this.props.tree[this.state.selectedTopic];return c("React").createElement(c("ContextualHelpFAQList.react"),{cmsIDs:p.cmsIDs,seeMoreLinkHref:p.seeMoreLinkHref,seeMoreLinkText:p.seeMoreLinkText,useWorkHelpCenter:this.props.workUserParams.useWorkHelpCenter,helpRef:c("HelpCenterReferrer").FACEBAR_DROPDOWN_HELP})};o.prototype.$ContextualHelpNav21=function(p){"use strict";this.setState({selectedTopic:p})};o.prototype.$ContextualHelpNav20=function(){"use strict";return c("React").createElement("div",{className:"_n23 clearfix"},c("React").createElement(c("XUIButton.react"),{className:"_n26",image:c("React").createElement(c("Image.react"),{src:h("122327")}),label:j._("Back"),onClick:this.$ContextualHelpNav22}))};o.prototype.$ContextualHelpNav19=function(){"use strict";return c("React").createElement("div",{className:"_n23 clearfix"},c("React").createElement("div",{className:"_n27"},j._("Quick Help")),this.props.workUserParams.useWorkHelpCenter===false&&c("React").createElement(c("Link.react"),{href:"/help/?ref=contextual",className:"_n28"},j._("Help Center")))};o.prototype.$ContextualHelpNav5=function(){"use strict";return this.state.selectedTopic===n&&!this.state.isSearchActive};o.propTypes={numMessages:m.number.isRequired,showPrivacyCheckup:m.bool.isRequired,tree:m.object.isRequired,workUserParams:m.shape({useWorkHelpCenter:m.bool.isRequired,showWorkCommunityLink:m.bool.isRequired,canContactSupport:m.bool.isRequired,isAdmin:m.bool.isRequired,canAccessDirectSupport:m.bool.isRequired}).isRequired};f.exports=o}),null);