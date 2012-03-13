function CP(){}
function xP(){}
function p2(){}
function e4(){}
function Ctb(){}
function Btb(){}
function y3b(){}
function O3b(){}
function S3b(){}
function W3b(){}
function $3b(){}
function P3b(b){this.b=b}
function T3b(b){this.b=b}
function X3b(b){$();this.b=b}
function M3b(b,c){b.enctype=c;b.encoding=c}
function byb(b,c){b.onload=function(){c.Mf()}}
function A3b(b){Mzb(b.n,false);b.o||(b.e.Kb[Tlc]=true,undefined);b.d=false}
function B3b(b){Mzb(b.n,true);b.e.Kb[Tlc]=false;b.d=true;if(b.o){z3b(b);b.o=false}}
function z3b(b){if(b.p){$doc.body.removeChild(b.p);b.p.onload=null;b.p=null}}
function f4(){var b;this.Kb=(b=$doc.createElement(Tmc),b.type=bnc,b)}
function _3b(b){var c;this.b=b;this.Kb=(c=$doc.createElement(Tmc),c.type='file',c);this.Kb[Fmc]='gwt-FileUpload'}
function E3b(b,c){if(b.f!=c){b.f=c;if(b.f){A$(b.e,1024);A$(b.e,2048)}}k$(b.Kb,'v-upload-immediate',b.f)}
function D3b(b){a_(b.k,b.n);a_(b.k,b.e);b.e=new _3b(b);b.e.Kb.name=b.j+Awc;b.e.Kb[Tlc]=!b.d;a3(b.k,b.e);a3(b.k,b.n);b.f&&A$(b.e,1024)}
function EP(){AP=new CP;Sb((Qb(),Pb),26);!!$stats&&$stats(vc(zwc,glc,-1,-1));AP.Jc();!!$stats&&$stats(vc(zwc,ytc,-1,-1))}
function BP(){var b,c,d;while(yP){d=lb;yP=yP.b;!yP&&(zP=null);if(!d){(prb(),orb).kg(GF,new Ctb);Tib()}else{try{(prb(),orb).kg(GF,new Ctb);Tib()}catch(b){b=MI(b);if(ur(b,38)){c=b;Lob.ue(c)}else throw b}}}}
function F3b(b){if(b.e.Kb.value.length==0||b.o||!b.d){Lob.we('Submit cancelled (disabled, no file or already submitted)');return}wgb(b.b);b.c.submit();b.o=true;Lob.we('Submitted form');A3b(b);b.q=new X3b(b);bb(b.q,800)}
function C3b(b){var c;if(!b.p){c=$doc.createElement(_mc);c.innerHTML="<iframe src=\"javascript:''\" name='"+b.j+"_TGT_FRAME' style='position:absolute;width:0;height:0;border:0'>"||blc;b.p=fe(c);$doc.body.appendChild(b.p);b.c.target=b.j+'_TGT_FRAME';byb(b.p,b)}}
function G3b(){this.Kb=$doc.createElement('form');this.e=new _3b(this);this.k=new d3;this.g=new f4;this.c=this.Kb;M3b(this.Kb,Bwc);this.c.method='post';n1(this,this.k);a3(this.k,this.g);a3(this.k,this.e);this.n=new Ozb;r$(this.n,new P3b(this),(yk(),yk(),xk));a3(this.k,this.n);this.Kb[Fmc]='v-upload';this.Hb==-1?$X(this.Kb,241|(this.Kb.__eventBits||0)):(this.Hb|=241)}
var Awc='_file',Cwc='buttoncaption',zwc='runCallbacks26';_=CP.prototype=xP.prototype=new J;_.gC=function DP(){return gv};_.Jc=function HP(){BP()};_.cM={};_=p2.prototype=new QZ;_.gC=function q2(){return dx};_.Oc=function r2(b){v$(this,b)};_.cM={10:1,13:1,15:1,22:1,70:1,71:1};_=f4.prototype=e4.prototype=new QZ;_.gC=function g4(){return sx};_.cM={10:1,13:1,15:1,22:1,70:1,71:1};_=Ctb.prototype=Btb.prototype=new J;_.He=function Dtb(){return new G3b};_.gC=function Etb(){return OA};_.cM={139:1};_=G3b.prototype=y3b.prototype=new k1;_.gC=function H3b(){return GF};_.ed=function I3b(){u$(this);!!this.b&&C3b(this)};_.Oc=function J3b(b){($Y(b.type)&241)>0&&(sqb(this.b.C,b,this,null),undefined);v$(this,b)};_.fd=function K3b(){w$(this);this.o||z3b(this)};_.Mf=function L3b(){jqb((Ec(),Dc),new T3b(this))};_.$d=function N3b(b,c){var d;if(Fgb(c,this,b,true)){return}if('notStarted' in b[1]){bb(this.q,400);return}if('forceSubmit' in b[1]){F3b(this);return}E3b(this,Boolean(b[1][Unc]));this.b=c;this.j=b[1][Xmc];this.i=b[1]['nextid'];d=Cgb(c,b[1][Xnc][wrc]);this.c.action=d;if(Cwc in b[1]){this.n.c.textContent=b[1][Cwc]||blc;this.n.Kb.style.display=blc}else{this.n.Kb.style.display=Clc}this.e.Kb.name=this.j+Awc;if(Tlc in b[1]||Snc in b[1]){A3b(this)}else if(!Boolean(b[1][koc])){B3b(this);C3b(this)}};_.cM={10:1,13:1,15:1,17:1,19:1,20:1,21:1,22:1,26:1,34:1,70:1,71:1,76:1,77:1};_.b=null;_.c=null;_.d=true;_.f=false;_.i=0;_.j=null;_.n=null;_.o=false;_.p=null;_.q=null;_=P3b.prototype=O3b.prototype=new J;_.gC=function Q3b(){return CF};_.fc=function R3b(b){this.b.f?(this.b.e.Kb.click(),undefined):F3b(this.b)};_.cM={12:1,40:1};_.b=null;_=T3b.prototype=S3b.prototype=new J;_.Tb=function U3b(){if(this.b.o){if(this.b.b){!!this.b.q&&ab(this.b.q);Lob.we('VUpload:Submit complete');wgb(this.b.b)}D3b(this.b);this.b.o=false;B3b(this.b);this.b.Gb||z3b(this.b)}};_.gC=function V3b(){return DF};_.cM={3:1,14:1};_.b=null;_=X3b.prototype=W3b.prototype=new Y;_.gC=function Y3b(){return EF};_.Pb=function Z3b(){Lob.we('Visiting server to see if upload started event changed UI.');Wfb(this.b.b,this.b.j,'pollForStart',blc+this.b.i,true,105)};_.cM={66:1};_.b=null;_=_3b.prototype=$3b.prototype=new p2;_.gC=function a4b(){return FF};_.Oc=function b4b(b){v$(this,b);if($Y(b.type)==1024){this.b.f&&this.b.e.Kb.value!=null&&!Scc(blc,this.b.e.Kb.value)&&F3b(this.b)}else if((ckb(),!bkb&&(bkb=new wkb),ckb(),bkb).b.i&&$Y(b.type)==2048){this.b.e.Kb.click();this.b.e.Kb.blur()}};_.cM={10:1,13:1,15:1,22:1,70:1,71:1};_.b=null;var gv=ybc(Fsc,'AsyncLoader26'),dx=ybc(Isc,'FileUpload'),sx=ybc(Isc,'Hidden'),OA=ybc(Psc,'WidgetMapImpl$36$1'),CF=ybc(Nsc,'VUpload$1'),DF=ybc(Nsc,'VUpload$2'),EF=ybc(Nsc,'VUpload$3'),FF=ybc(Nsc,'VUpload$MyFileUpload');Zkc(EP)();