if (self.CavalryLogger) { CavalryLogger.start_js(["UPGJr"]); }

__d("EventTicketingSelfServeMessageRowContainerQuery.graphql",[],(function a(b,c,d,e,f,g){"use strict";var h=function(){var i=[{kind:"LocalArgument",name:"eventID",type:"ID!",defaultValue:null}],j=[{kind:"Variable",name:"id",variableName:"eventID",type:"ID!"}],k={kind:"ScalarField",alias:null,name:"can_viewer_message",args:null,storageKey:null},l={kind:"ScalarField",alias:null,name:"id",args:null,storageKey:null},m={kind:"ScalarField",alias:null,name:"name",args:null,storageKey:null},n={kind:"InlineFragment",type:"Page",selections:[{kind:"ScalarField",alias:null,name:"messenger_platform_responsiveness_text",args:null,storageKey:null}]},o={kind:"ScalarField",alias:null,name:"ticket_setting_type",args:null,storageKey:null},p={kind:"ScalarField",alias:null,name:"messaging_type",args:null,storageKey:null},q={kind:"ScalarField",alias:null,name:"__typename",args:null,storageKey:null};return{kind:"Request",operationKind:"query",name:"EventTicketingSelfServeMessageRowContainerQuery",id:"1470058849775522",text:null,metadata:{},fragment:{kind:"Fragment",name:"EventTicketingSelfServeMessageRowContainerQuery",type:"Query",metadata:null,argumentDefinitions:i,selections:[{kind:"LinkedField",alias:"event",name:"node",storageKey:null,args:j,concreteType:null,plural:false,selections:[{kind:"InlineFragment",type:"Event",selections:[{kind:"LinkedField",alias:null,name:"event_creator",storageKey:null,args:null,concreteType:null,plural:false,selections:[k,l,m,n]},{kind:"LinkedField",alias:null,name:"ticket_settings",storageKey:null,args:null,concreteType:"EventTicketSettingFromEventConnection",plural:false,selections:[{kind:"LinkedField",alias:null,name:"nodes",storageKey:null,args:null,concreteType:"EventTicketSetting",plural:true,selections:[o,p]}]}]}]}]},operation:{kind:"Operation",name:"EventTicketingSelfServeMessageRowContainerQuery",argumentDefinitions:i,selections:[{kind:"LinkedField",alias:"event",name:"node",storageKey:null,args:j,concreteType:null,plural:false,selections:[q,l,{kind:"InlineFragment",type:"Event",selections:[{kind:"LinkedField",alias:null,name:"event_creator",storageKey:null,args:null,concreteType:null,plural:false,selections:[q,k,l,m,n]},{kind:"LinkedField",alias:null,name:"ticket_settings",storageKey:null,args:null,concreteType:"EventTicketSettingFromEventConnection",plural:false,selections:[{kind:"LinkedField",alias:null,name:"nodes",storageKey:null,args:null,concreteType:"EventTicketSetting",plural:true,selections:[o,p,l]}]}]}]}]}}}();f.exports=h}),null);
__d("EventTicketingSelfServeMessageRowContainer.react",["ix","cx","fbt","React","idx","RelayModern","RelayFBEnvironment","Layout.react","fbglyph","EventTicketingUtil","Image.react","Link.react","MercuryIDs","FantaTabActions","EventTicketingGatingConfig","EventTicketingSelfServeMessageRowContainerQuery.graphql"],(function a(b,c,d,e,f,g,h,i,j){"use strict";__p&&__p();var k,l,m=c("RelayModern").QueryRenderer,n=c("RelayModern").graphql,o=c("Layout.react").Column,p=c("Layout.react").FillColumn,q=function q(){return c("EventTicketingSelfServeMessageRowContainerQuery.graphql")};k=babelHelpers.inherits(r,c("React").Component);l=k&&k.prototype;r.prototype.$EventTicketingSelfServeMessageRowContainer1=function(s){var t=c("MercuryIDs").getThreadIDFromUserID(s);c("FantaTabActions").openTab(t)};r.prototype.$EventTicketingSelfServeMessageRowContainer2=function(s){__p&&__p();var t,u,v,w=s.error,x=s.props,event=(t=x)!=null?t.event:t;if(w||!event)return null;var y=event.ticket_settings,z=event.event_creator;y=y.nodes;var A=(u=y)!=null?(u=u[0])!=null?u.ticket_setting_type:u:u,B=(v=y)!=null?(v=v[0])!=null?v.messaging_type:v:v;if(z!==null&&!z.can_viewer_message||z===null||A!=="REGISTRATION"||B==="NO_MESSAGING"||!c("EventTicketingGatingConfig").GK_SELF_SERVE_MESSAGE_HOST_ROW)return null;var C=z.messenger_platform_responsiveness_text,D=c("React").createElement(c("Layout.react"),{className:"_20z9"},c("React").createElement(o,{className:"_2zty"},c("React").createElement(c("Image.react"),{src:h("123858")})),c("React").createElement(p,null,c("React").createElement("div",{className:"_20zb"},c("React").createElement("div",{className:(C!==null?"_20zc":"")+(C===null?" _20zf":"")},c("EventTicketingUtil").getEventHostedBySentence(z.name)),c("React").createElement("div",{className:"_20zd"},c("React").createElement("span",null,C)))),c("React").createElement(o,null,c("React").createElement("div",{className:"_20ze"},c("React").createElement(c("Link.react"),{onClick:function(){return this.$EventTicketingSelfServeMessageRowContainer1(z.id)}.bind(this),target:"_blank"},j._("Message Host")))));return c("React").createElement("div",{className:"_2pij _2pis"},D)};r.prototype.render=function(){return c("React").createElement(m,{environment:c("RelayFBEnvironment"),query:q,variables:{eventID:this.props.eventID},render:function(s){return this.$EventTicketingSelfServeMessageRowContainer2(s)}.bind(this)})};function r(){k.apply(this,arguments)}f.exports=r}),null);