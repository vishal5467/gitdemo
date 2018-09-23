if (self.CavalryLogger) { CavalryLogger.start_js(["0O7A6"]); }

__d("AppsDivebarDisplayController",["cx","AppsDivebarConfigData","AsyncRequest","Arbiter","CSS","UIPagelet","$"],(function a(b,c,d,e,f,g,h){__p&&__p();var i=171,j={isVisible:function k(){if(this._visible!==undefined)return this._visible;this._visible=!c("AppsDivebarConfigData").hidden;return this._visible},showApps:function k(){this._visible=true;var l={fb_source_category:"sidebar"};c("UIPagelet").loadFromEndpoint("GamesDivebarPagelet","pagelet_canvas_nav_content",l);c("CSS").show(c("$")("apps_gripper"));c("CSS").show(c("$")("pagelet_canvas_nav_content"));c("CSS").addClass(c("$")("pagelet_canvas_nav_content"),"_4woj");c("Arbiter").inform("AppsDivebar/show-apps");new(c("AsyncRequest"))("/ajax/feed/apps/resize").setData({height:""+i,menu:true}).setMethod("POST").send()},hideApps:function k(){this._visible=false;c("CSS").hide(c("$")("pagelet_canvas_nav_content"));c("CSS").hide(c("$")("apps_gripper"));c("Arbiter").inform("AppsDivebar/hide-apps");new(c("AsyncRequest"))("/ajax/feed/apps/resize").setData({height:"1",menu:true}).setMethod("POST").send()}};f.exports=j}),null);
__d("ChatSidebarDropdownConstants",[],(function a(b,c,d,e,f,g){var h=Object.freeze({SOUND:"sound",ADVANCED_SETTINGS:"advanced_settings",BLOCK_SETTINGS:"block_settings",TURN_OFF_DIALOG:"turn_off_dialog",CLOSE_ALL_TABS:"close_all_tabs",LOWER_ALL_TABS:"lower_all_tabs",TOGGLE_DISCOVER_BOTS:"toggle_discover_bots",SIDEBAR:"sidebar",HIDE_GROUPS:"hide_groups",ONLINE:"online",VIDEOCALL_ON:"videoon",VIDEOCALL_OFF:"videooff",PAUSE:"pause",SHOW_APPS:"show_apps",HIDE_APPS:"hide_apps",SHOW_TICKER:"show_ticker",HIDE_TICKER:"hide_ticker",HIDE_ADMINED_PAGES:"hide_admined_pages",HIDE_BUSINESSES:"hide_businesses",EMOJI_SETTINGS:"emoji_settings"});f.exports=h}),null);
__d("XChatEmojiSettingsController",["XController"],(function a(b,c,d,e,f,g){f.exports=c("XController").create("/chat/emoji_settings/",{__asyncDialog:{type:"Int"}})}),null);
__d("ChatSidebarDropdown.react",["cx","fbt","AppsDivebarDisplayController","Arbiter","AsyncRequest","ChatConfig","ChatOptions","ChatSidebarBotsActions","ChatSidebarBotsStore","ChatSidebarDropdownConstants","ChatVisibility","ContextualDialogArrow","ContextualLayerAutoFlip","ConversationNubUtils","CurrentUser","FantaTabActions","FBRTCCallBlockingStore","FBRTCSupport","LayerHideOnBlur","Link.react","LogHistory","MenuSeparator.react","PinnedConversationNubsConfig","PopoverMenu.react","PresencePrivacy","PresenceState","React","ReactXUIMenu","SidebarType","SubscriptionsHandler","TrackingNodes","URI","XChatEmojiSettingsController","emptyFunction","ge","joinClasses"],(function a(b,c,d,e,f,g,h,i){"use strict";__p&&__p();var j,k,l=c("ChatSidebarBotsActions").module,m=c("ChatSidebarBotsStore").module,n=c("ReactXUIMenu").SelectableItem,o=c("ReactXUIMenu").SelectableMenu,p=c("ReactXUIMenu").Item,q=c("React").PropTypes,r=c("LogHistory").getInstance("blackbird");j=babelHelpers.inherits(s,c("React").PureComponent);k=j&&j.prototype;function s(){var t,u;for(var v=arguments.length,w=Array(v),x=0;x<v;x++)w[x]=arguments[x];return u=(t=k.constructor).call.apply(t,[this].concat(w)),this.$ChatSidebarDropdown6=function(y,z){var A=z.item.getValue(),B=z.item.isSelected&&z.item.isSelected();this.$ChatSidebarDropdown5(A,!!B)}.bind(this),this.state={appsVisible:c("AppsDivebarDisplayController").isVisible(),isConversationsEnabled:c("PinnedConversationNubsConfig").isEnabled,isDiscoverBotsHidden:m?m.getState().isHidden:true,isOnline:c("ChatVisibility").isOnline(),isTickerVisible:this.$ChatSidebarDropdown2(),isCallBlocked:c("FBRTCCallBlockingStore").getBlockingStatus(),pendingChange:false},u}s.prototype.componentDidMount=function(){__p&&__p();this.$ChatSidebarDropdown1=new(c("SubscriptionsHandler"))();this.$ChatSidebarDropdown1.addSubscriptions(c("Arbiter").subscribe(["Ticker/resized","ticker/show"],function(){this.setState({isTickerVisible:this.$ChatSidebarDropdown2()})}.bind(this)),c("Arbiter").subscribe(["AppsDivebar/show-apps","AppsDivebar/hide-apps"],function(){this.setState({appsVisible:c("AppsDivebarDisplayController").isVisible()})}.bind(this)),c("PresencePrivacy").subscribe("privacy-user-presence-changed",function(){this.setState({isOnline:c("ChatVisibility").isOnline()})}.bind(this)),c("Arbiter").subscribe("buddylist/hide",function(){this.refs.menu.hidePopover()}.bind(this)),c("Arbiter").subscribe("sidebar/visibility",function(t,u){if(!u)this.refs.menu.hidePopover()}.bind(this)),c("FBRTCCallBlockingStore").addListener(function(){this.setState({isCallBlocked:c("FBRTCCallBlockingStore").getBlockingStatus()})}.bind(this)));if(m)this.$ChatSidebarDropdown1.addSubscriptions(m.addListener(function(){this.setState({isDiscoverBotsHidden:m.getState().isHidden})}.bind(this)));if(c("PinnedConversationNubsConfig").userSettingsIsEnabled)this.$ChatSidebarDropdown1.addSubscriptions(c("Arbiter").subscribe(c("ConversationNubUtils").TURN_CONVERSATIONS_OFF_EVENT,function(){this.setState({isConversationsEnabled:false})}.bind(this)),c("Arbiter").subscribe(c("ConversationNubUtils").TURN_CONVERSATIONS_ON_EVENT,function(){this.setState({isConversationsEnabled:true})}.bind(this)))};s.prototype.componentWillUnmount=function(){this.$ChatSidebarDropdown1&&this.$ChatSidebarDropdown1.release()};s.prototype.$ChatSidebarDropdown2=function(){var t=c("ge")("pagelet_ticker");return!!(t&&t.offsetHeight!==0)};s.prototype.$ChatSidebarDropdown3=function(t,u){var v=u?"sidebar_dropdown_visibility_error":"sidebar_dropdown_set_visibility";r.debug(v,JSON.stringify({action:t}))};s.prototype.$ChatSidebarDropdown4=function(t,u){if(this.state.pendingChange)return;this.setState({pendingChange:true});var v={};v[t]=!u;c("ChatOptions").setSetting(t,!u,"mini_sidebar_menu");new(c("AsyncRequest"))("/ajax/chat/settings.php").setHandler(c("PresenceState").doSync).setErrorHandler(function(){return c("ChatOptions").setSetting(t,u,"mini_sidebar_menu_error")}).setFinallyHandler(function(){return this.setState({pendingChange:false})}.bind(this)).setData(v).setAllowCrossPageTransition(true).send()};s.prototype.$ChatSidebarDropdown5=function(t,u){__p&&__p();var v=true;switch(t){case c("ChatSidebarDropdownConstants").SOUND:this.$ChatSidebarDropdown4(t,u);break;case c("ChatSidebarDropdownConstants").ADVANCED_SETTINGS:case c("ChatSidebarDropdownConstants").TURN_OFF_DIALOG:this.$ChatSidebarDropdown3(t,false);break;case c("ChatSidebarDropdownConstants").LOWER_ALL_TABS:c("FantaTabActions").minimizeAllTabs();break;case c("ChatSidebarDropdownConstants").CLOSE_ALL_TABS:c("FantaTabActions").closeAllTabs();this.$ChatSidebarDropdown3(t,false);break;case c("ChatSidebarDropdownConstants").HIDE_GROUPS:this.$ChatSidebarDropdown4(t,u);break;case c("ChatSidebarDropdownConstants").TOGGLE_DISCOVER_BOTS:if(l)l.saveSettings({isHidden:!this.state.isDiscoverBotsHidden});break;case c("ChatSidebarDropdownConstants").SIDEBAR:this.props.onToggleSidebar();v=false;break;case c("ChatSidebarDropdownConstants").ONLINE:!this.state.isOnline?c("ChatVisibility").goOnline():this.$ChatSidebarDropdown3(t,true);break;case c("ChatSidebarDropdownConstants").VIDEOCALL_ON:c("FBRTCCallBlockingStore").turnOnVideoCalling();break;case c("ChatSidebarDropdownConstants").VIDEOCALL_OFF:break;case c("ChatSidebarDropdownConstants").PAUSE:break;case c("ChatSidebarDropdownConstants").SHOW_TICKER:c("Arbiter").inform("ChatSidebarDropdown/openTicker");break;case c("ChatSidebarDropdownConstants").HIDE_TICKER:c("Arbiter").inform("ChatSidebarDropdown/closeTicker");break;case c("ConversationNubUtils").TURN_CONVERSATIONS_OFF_EVENT:c("ConversationNubUtils").turnConversationsOff();break;case c("ConversationNubUtils").TURN_CONVERSATIONS_ON_EVENT:c("ConversationNubUtils").turnConversationsOn();break;case c("ChatSidebarDropdownConstants").SHOW_APPS:c("AppsDivebarDisplayController").showApps();break;case c("ChatSidebarDropdownConstants").HIDE_APPS:c("AppsDivebarDisplayController").hideApps();break;case c("ChatSidebarDropdownConstants").HIDE_ADMINED_PAGES:this.$ChatSidebarDropdown4(t,u);break;case c("ChatSidebarDropdownConstants").HIDE_BUSINESSES:this.$ChatSidebarDropdown4(t,u);break}if(v&&this.refs.menu)this.refs.menu.hidePopover()};s.prototype.$ChatSidebarDropdown7=function(){return c("React").createElement(n,{value:c("ChatSidebarDropdownConstants").SOUND,selected:c("ChatOptions").getSetting(c("ChatSidebarDropdownConstants").SOUND)},i._("Chat Sounds"))};s.prototype.$ChatSidebarDropdown8=function(){if(!c("ChatConfig").get("messenger_new_emoji_set"))return null;var t=c("XChatEmojiSettingsController").getURIBuilder().getURI();return c("React").createElement(p,{href:t,rel:"dialog",value:c("ChatSidebarDropdownConstants").EMOJI_SETTINGS},i._("Emoji"))};s.prototype.$ChatSidebarDropdown9=function(){if(c("CurrentUser").isWorkUser())return null;return c("React").createElement(p,{href:new(c("URI"))("/settings?tab=blocking"),value:c("ChatSidebarDropdownConstants").BLOCK_SETTINGS},i._("Block Settings"))};s.prototype.$ChatSidebarDropdown10=function(){return c("React").createElement(p,{href:new(c("URI"))("/ajax/chat/privacy/settings_dialog.php"),rel:"dialog",value:c("ChatSidebarDropdownConstants").ADVANCED_SETTINGS},i._("Advanced Settings..."))};s.prototype.$ChatSidebarDropdown11=function(){return c("React").createElement(p,{value:c("ChatSidebarDropdownConstants").LOWER_ALL_TABS},i._("Collapse All Chat Tabs"))};s.prototype.$ChatSidebarDropdown12=function(){return c("React").createElement(p,{value:c("ChatSidebarDropdownConstants").CLOSE_ALL_TABS},i._("Close All Chat Tabs"))};s.prototype.$ChatSidebarDropdown13=function(){return c("React").createElement(p,{className:"_4kqp",value:c("ChatSidebarDropdownConstants").SIDEBAR},i._("Hide Sidebar"))};s.prototype.$ChatSidebarDropdown14=function(){if(this.props.sidebarType===c("SidebarType").BUDDYLIST_NUB||!c("ChatConfig").get("show_admined_pages"))return null;return c("React").createElement(n,{className:"_4kqp",value:c("ChatSidebarDropdownConstants").HIDE_ADMINED_PAGES,selected:c("ChatOptions").getSetting(c("ChatSidebarDropdownConstants").HIDE_ADMINED_PAGES)},i._("Hide Pages You Manage"))};s.prototype.$ChatSidebarDropdown15=function(){if(this.props.sidebarType===c("SidebarType").BUDDYLIST_NUB||!c("ChatConfig").get("show_businesses"))return null;return c("React").createElement(n,{className:"_4kqp",value:c("ChatSidebarDropdownConstants").HIDE_BUSINESSES,selected:c("ChatOptions").getSetting(c("ChatSidebarDropdownConstants").HIDE_BUSINESSES)},i._("Hide Pages to Contact"))};s.prototype.$ChatSidebarDropdown16=function(){if(this.props.sidebarType===c("SidebarType").BUDDYLIST_NUB)return null;return c("React").createElement(n,{value:c("ChatSidebarDropdownConstants").HIDE_GROUPS,selected:c("ChatOptions").getSetting(c("ChatSidebarDropdownConstants").HIDE_GROUPS)},i._("Hide Groups"))};s.prototype.$ChatSidebarDropdown17=function(){var t=c("ChatVisibility").isOnline(),u=t?new(c("URI"))("/ajax/chat/privacy/settings_dialog.php").addQueryData("dialog_type","turn_off_dialog"):"#",v=t?i._("Turn Off Chat"):i._("Turn On Chat"),w=t?c("ChatSidebarDropdownConstants").TURN_OFF_DIALOG:c("ChatSidebarDropdownConstants").ONLINE;return c("React").createElement(p,{href:u,rel:t?"dialog":"",value:w},v)};s.prototype.$ChatSidebarDropdown18=function(){if(!c("FBRTCSupport").isVideoCallBlockingSupported())return null;var t=this.state.isCallBlocked,u=t?"#":new(c("URI"))("/videocall/off/"),v=t?i._("Turn On Video\/Voice Calls"):i._("Turn Off Video\/Voice Calls"),w=t?c("ChatSidebarDropdownConstants").VIDEOCALL_ON:c("ChatSidebarDropdownConstants").VIDEOCALL_OFF;return c("React").createElement(p,{href:u,rel:t?"":"dialog",value:w},v)};s.prototype.$ChatSidebarDropdown19=function(){var t=m?m.getState().bots:[];if(!l||t.length===0)return null;var u=this.state.isDiscoverBotsHidden?i._("Show Bot Discovery"):i._("Hide Bot Discovery");return c("React").createElement(p,{value:c("ChatSidebarDropdownConstants").TOGGLE_DISCOVER_BOTS},u)};s.prototype.$ChatSidebarDropdown20=function(){if(!c("PinnedConversationNubsConfig").userSettingsIsEnabled)return null;var t=this.state.isConversationsEnabled,u=t?i._("Turn Off Post Tabs"):i._("Turn On Post Tabs"),v=t?c("ConversationNubUtils").TURN_CONVERSATIONS_OFF_EVENT:c("ConversationNubUtils").TURN_CONVERSATIONS_ON_EVENT;return c("React").createElement(p,{value:v},u)};s.prototype.$ChatSidebarDropdown21=function(){if(!c("ChatConfig").get("has_apps_option")||this.props.sidebarType!==c("SidebarType").SIDEBAR)return null;var t=this.state.appsVisible,u=t?i._("Hide Games"):i._("Show Games"),v=t?c("ChatSidebarDropdownConstants").HIDE_APPS:c("ChatSidebarDropdownConstants").SHOW_APPS;return[c("React").createElement(c("MenuSeparator.react"),{key:"apps_separator"}),c("React").createElement(p,{value:v,key:"apps_menu"},u)]};s.prototype.$ChatSidebarDropdown22=function(){if(!c("ChatConfig").get("has_ticker_toggle_option")||this.props.sidebarType!==c("SidebarType").SIDEBAR)return null;var t=this.state.isTickerVisible,u=t?i._("Hide Ticker"):i._("Show Ticker"),v=t?c("ChatSidebarDropdownConstants").HIDE_TICKER:c("ChatSidebarDropdownConstants").SHOW_TICKER;return[c("React").createElement(c("MenuSeparator.react"),{key:"ticker_separator"}),c("React").createElement(p,{value:v,key:"ticker_menu"},u)]};s.prototype.$ChatSidebarDropdown23=function(){return c("React").createElement(o,{className:"fbChatSidebarDropdown/PopoverMenu",multiple:true,onItemClick:this.$ChatSidebarDropdown6},this.$ChatSidebarDropdown7(),this.$ChatSidebarDropdown8(),this.$ChatSidebarDropdown9(),this.$ChatSidebarDropdown10(),c("React").createElement(c("MenuSeparator.react"),null),this.$ChatSidebarDropdown11(),this.$ChatSidebarDropdown12(),this.$ChatSidebarDropdown19(),this.$ChatSidebarDropdown13(),this.$ChatSidebarDropdown14(),this.$ChatSidebarDropdown15(),this.$ChatSidebarDropdown16(),this.$ChatSidebarDropdown17(),this.$ChatSidebarDropdown18(),this.$ChatSidebarDropdown20(),this.$ChatSidebarDropdown21(),this.$ChatSidebarDropdown22())};s.prototype.render=function(){var t=i._("Options"),u=c("joinClasses")(this.props.className,"_5qth _5vm9"+(!c("ChatVisibility").isOnline()?" _5vma":"")),v=c("TrackingNodes").getTrackingInfo(c("TrackingNodes").types.DROPDOWN_BUTTON);return c("React").createElement(c("PopoverMenu.react"),{alignh:"right",alignv:"top",className:u,layerBehaviors:[c("ContextualLayerAutoFlip"),c("ContextualDialogArrow"),c("LayerHideOnBlur")],menu:this.$ChatSidebarDropdown23(),onHide:this.props.onHide,onShow:this.props.onShow,ref:"menu"},c("React").createElement(c("Link.react"),{"aria-label":t,className:"_5vmb button","data-ft":v,"data-hover":"tooltip","data-tooltip-content":t,"data-tooltip-position":"below",href:"#"}))};s.propTypes={className:q.string,onHide:q.func,onShow:q.func,onToggleSidebar:q.func.isRequired,sidebarType:q.string.isRequired};s.defaultProps={className:"",onHide:c("emptyFunction"),onShow:c("emptyFunction")};f.exports=s}),null);