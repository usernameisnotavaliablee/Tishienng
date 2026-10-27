package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class AdSpacesBean {
    public static final int DIRECT_DOWNLOAD_APP_DECIDE = 0;
    public static final int DIRECT_DOWNLOAD_SERVER_NO = 1;
    public static final int DIRECT_DOWNLOAD_SERVER_YES = 2;

    @com.beizi.fusion.model.JsonNode(key = "adType")
    private java.lang.String adType;

    @com.beizi.fusion.model.JsonNode(key = "appId")
    private java.lang.String appId;

    @com.beizi.fusion.model.JsonNode(key = "bid")
    private com.beizi.fusion.model.AdSpacesBean.BidBean bid;

    @com.beizi.fusion.model.JsonNode(key = "bidComponent")
    private com.beizi.fusion.model.AdSpacesBean.BidComponent bidComponent;

    @com.beizi.fusion.model.JsonNode(key = "buyer")
    private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> buyer;

    @com.beizi.fusion.model.JsonNode(key = "bzComponentSsid")
    private java.lang.String bzComponentSsid;

    @com.beizi.fusion.model.JsonNode(key = "component")
    private com.beizi.fusion.model.AdSpacesBean.ComponentBean component;

    @com.beizi.fusion.model.JsonNode(key = "componentSsid")
    private java.lang.String componentSsid;

    @com.beizi.fusion.model.JsonNode(key = "eventStrategy")
    private com.beizi.fusion.model.AdSpacesBean.EventStrategyBean eventStrategy;

    @com.beizi.fusion.model.JsonNode(key = "filter")
    private com.beizi.fusion.model.AdSpacesBean.FilterBean filter;

    @com.beizi.fusion.model.JsonNode(key = "filterSsid")
    private java.lang.String filterSsid;

    @com.beizi.fusion.model.JsonNode(key = "modelType")
    private int modelType;

    @com.beizi.fusion.model.JsonNode(key = "spaceId")
    private java.lang.String spaceId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AdSizeBean {

        @com.beizi.fusion.model.JsonNode(key = "height")
        private java.lang.String height;

        @com.beizi.fusion.model.JsonNode(key = "width")
        private java.lang.String width;

        public AdSizeBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.AdSizeBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$AdSizeBean> r0 = com.beizi.fusion.model.AdSpacesBean.AdSizeBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$AdSizeBean r1 = (com.beizi.fusion.model.AdSpacesBean.AdSizeBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public java.lang.String getHeight() {
                r1 = this;
                java.lang.String r0 = r1.height
                return r0
        }

        public java.lang.String getWidth() {
                r1 = this;
                java.lang.String r0 = r1.width
                return r0
        }

        public void setHeight(java.lang.String r1) {
                r0 = this;
                r0.height = r1
                return
        }

        public void setWidth(java.lang.String r1) {
                r0 = this;
                r0.width = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AdSizeBean{, width="
                r0.append(r1)
                java.lang.String r1 = r2.width
                r0.append(r1)
                java.lang.String r1 = ", height="
                r0.append(r1)
                java.lang.String r1 = r2.height
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BidBean {

        @com.beizi.fusion.model.JsonNode(key = "bidTime")
        private int bidTime;

        @com.beizi.fusion.model.JsonNode(key = "reserveFRWTime")
        private int reserveFRWTime;

        @com.beizi.fusion.model.JsonNode(key = "reserveTime")
        private int reserveTime;

        @com.beizi.fusion.model.JsonNode(key = "timeOut")
        private int timeOut;

        public BidBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.BidBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$BidBean> r0 = com.beizi.fusion.model.AdSpacesBean.BidBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$BidBean r1 = (com.beizi.fusion.model.AdSpacesBean.BidBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public int getBidTime() {
                r1 = this;
                int r0 = r1.bidTime
                return r0
        }

        public int getReserveFRWTime() {
                r1 = this;
                int r0 = r1.reserveFRWTime
                return r0
        }

        public int getReserveTime() {
                r1 = this;
                int r0 = r1.reserveTime
                return r0
        }

        public int getTimeOut() {
                r1 = this;
                int r0 = r1.timeOut
                return r0
        }

        public void setBidTime(int r1) {
                r0 = this;
                r0.bidTime = r1
                return
        }

        public void setReserveFRWTime(int r1) {
                r0 = this;
                r0.reserveFRWTime = r1
                return
        }

        public void setReserveTime(int r1) {
                r0 = this;
                r0.reserveTime = r1
                return
        }

        public void setTimeOut(int r1) {
                r0 = this;
                r0.timeOut = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BidBean{reserveFRWTime="
                r0.append(r1)
                int r1 = r2.reserveFRWTime
                r0.append(r1)
                java.lang.String r1 = ", reserveTime="
                r0.append(r1)
                int r1 = r2.reserveTime
                r0.append(r1)
                java.lang.String r1 = ", bidTime="
                r0.append(r1)
                int r1 = r2.bidTime
                r0.append(r1)
                java.lang.String r1 = ", timeOut="
                r0.append(r1)
                int r1 = r2.timeOut
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BidComponent {

        @com.beizi.fusion.model.JsonNode(key = "bidList")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> bidList;

        @com.beizi.fusion.model.JsonNode(key = "rules")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> rules;

        public BidComponent() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> getBidList() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$ForwardBean> r0 = r1.bidList
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> getRules() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r0 = r1.rules
                return r0
        }

        public void setBidList(java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> r1) {
                r0 = this;
                r0.bidList = r1
                return
        }

        public void setRules(java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> r1) {
                r0 = this;
                r0.rules = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BidComponent{rules="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r1 = r2.rules
                r0.append(r1)
                java.lang.String r1 = ", bidList="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$ForwardBean> r1 = r2.bidList
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BuyerBean implements java.lang.Cloneable {

        @com.beizi.fusion.model.JsonNode(key = "adSize")
        private com.beizi.fusion.model.AdSpacesBean.AdSizeBean adSize;

        @com.beizi.fusion.model.JsonNode(key = "adType")
        private java.lang.String adType;

        @com.beizi.fusion.model.JsonNode(key = "adWorker")
        private java.lang.String adWorker;

        @com.beizi.fusion.model.JsonNode(key = "appId")
        private java.lang.String appId;

        @com.beizi.fusion.model.JsonNode(key = "avgPrice")
        private double avgPrice;

        @com.beizi.fusion.model.JsonNode(key = "bidPrice")
        private double bidPrice;

        @com.beizi.fusion.model.JsonNode(key = "bidType")
        private java.lang.String bidType;

        @com.beizi.fusion.model.JsonNode(key = "buyerSpaceUuId")
        private java.lang.String buyerSpaceUuId;

        @com.beizi.fusion.model.JsonNode(key = "cache")
        private int cache;

        @com.beizi.fusion.model.JsonNode(key = "cacheNum")
        private int cacheNum;

        @com.beizi.fusion.model.JsonNode(key = "callBackStrategy")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean> callBackStrategy;

        @com.beizi.fusion.model.JsonNode(key = "callBackStrategyUuid")
        private java.lang.String callBackStrategyUuid;

        @com.beizi.fusion.model.JsonNode(key = "complain")
        private com.beizi.fusion.model.AdSpacesBean.ComplainBean complain;

        @com.beizi.fusion.model.JsonNode(key = "directDownload")
        private int directDownload;

        @com.beizi.fusion.model.JsonNode(key = "dislike")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean dislikeConfig;

        @com.beizi.fusion.model.JsonNode(key = "eulerAngleRule")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleRule;

        @com.beizi.fusion.model.JsonNode(key = "filter")
        private com.beizi.fusion.model.AdSpacesBean.FilterBean filter;

        @com.beizi.fusion.model.JsonNode(key = "filterSsid")
        private java.lang.String filterSsid;

        @com.beizi.fusion.model.JsonNode(key = "fullScreenClick")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClick;

        @com.beizi.fusion.model.JsonNode(key = "id")
        private java.lang.String id;

        @com.beizi.fusion.model.JsonNode(key = "interactionRules")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderRulesBean> interactionRules;

        @com.beizi.fusion.model.JsonNode(key = "isAnimation")
        private int isAnimation;

        @com.beizi.fusion.model.JsonNode(key = "isHideInteraction")
        private int isHideInteraction;

        @com.beizi.fusion.model.JsonNode(key = "isImageSpeed")
        private int isImageSpeed;

        @com.beizi.fusion.model.JsonNode(key = "isPlaceHolder")
        private int isPlaceHolder;

        @com.beizi.fusion.model.JsonNode(key = "isSendBidData")
        private int isSendBidData;

        @com.beizi.fusion.model.JsonNode(key = "lastTime")
        private int lastTime;

        @com.beizi.fusion.model.JsonNode(key = "minShowTime")
        private int minShowTime;

        @com.beizi.fusion.model.JsonNode(key = "nativeOptimize")
        private com.beizi.fusion.model.AdSpacesBean.NativeOptimizeBean nativeOptimize;

        @com.beizi.fusion.model.JsonNode(key = "nativeRule")
        private com.beizi.fusion.model.AdSpacesBean.NativeRuleBean nativeRule;

        @com.beizi.fusion.model.JsonNode(key = "priceDict")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.PriceDictBean> priceDict;

        @com.beizi.fusion.model.JsonNode(key = "regionalClickView")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickView;

        @com.beizi.fusion.model.JsonNode(key = "renderAds")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderAds renderAds;

        @com.beizi.fusion.model.JsonNode(key = "renderView")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> renderView;

        @com.beizi.fusion.model.JsonNode(key = "renderViewSsid")
        private java.lang.String renderViewSsid;

        @com.beizi.fusion.model.JsonNode(key = "reqTimeOutType")
        private int reqTimeOutType;

        @com.beizi.fusion.model.JsonNode(key = "rollView")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean rollView;

        @com.beizi.fusion.model.JsonNode(key = "screenConfigVo")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.ScreenConfigVoBean> screenConfigVo;

        @com.beizi.fusion.model.JsonNode(key = "scrollClick")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean scrollClick;

        @com.beizi.fusion.model.JsonNode(key = "shakeView")
        private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean shakeView;

        @com.beizi.fusion.model.JsonNode(key = "sizeRatio")
        private int sizeRatio;

        @com.beizi.fusion.model.JsonNode(key = "spaceId")
        private java.lang.String spaceId;

        @com.beizi.fusion.model.JsonNode(key = "template")
        private int template;

        @com.beizi.fusion.model.JsonNode(key = "waitTime")
        private int waitTime;

        @com.beizi.fusion.model.JsonNode(key = "zone")
        private java.lang.String zone;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class AliaseShakeViewBean {

            @com.beizi.fusion.model.JsonNode(key = "passivationTime")
            private int passivationTime;

            @com.beizi.fusion.model.JsonNode(key = "rotatAmplitude")
            private double rotatAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rotatCount")
            private int rotatCount;

            @com.beizi.fusion.model.JsonNode(key = "shakeCount")
            private int shakeCount;

            @com.beizi.fusion.model.JsonNode(key = "shakeEndAmplitude")
            private double shakeEndAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "shakeStartAmplitude")
            private double shakeStartAmplitude;

            public AliaseShakeViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public int getPassivationTime() {
                    r1 = this;
                    int r0 = r1.passivationTime
                    return r0
            }

            public double getRotatAmplitude() {
                    r2 = this;
                    double r0 = r2.rotatAmplitude
                    return r0
            }

            public int getRotatCount() {
                    r1 = this;
                    int r0 = r1.rotatCount
                    return r0
            }

            public int getShakeCount() {
                    r1 = this;
                    int r0 = r1.shakeCount
                    return r0
            }

            public double getShakeEndAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeEndAmplitude
                    return r0
            }

            public double getShakeStartAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeStartAmplitude
                    return r0
            }

            public void setPassivationTime(int r1) {
                    r0 = this;
                    r0.passivationTime = r1
                    return
            }

            public void setRotatAmplitude(double r1) {
                    r0 = this;
                    r0.rotatAmplitude = r1
                    return
            }

            public void setRotatCount(int r1) {
                    r0 = this;
                    r0.rotatCount = r1
                    return
            }

            public void setShakeCount(int r1) {
                    r0 = this;
                    r0.shakeCount = r1
                    return
            }

            public void setShakeEndAmplitude(double r1) {
                    r0 = this;
                    r0.shakeEndAmplitude = r1
                    return
            }

            public void setShakeStartAmplitude(double r1) {
                    r0 = this;
                    r0.shakeStartAmplitude = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class CoolRollViewBean {

            @com.beizi.fusion.model.JsonNode(key = "coolTime")
            private long coolTime;

            @com.beizi.fusion.model.JsonNode(key = "rollMinusAmplitude")
            private double rollMinusAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rollPlusAmplitude")
            private double rollPlusAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rollTime")
            private long rollTime;

            @com.beizi.fusion.model.JsonNode(key = "userProtectTime")
            private long userProtectTime;

            public CoolRollViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public long getCoolTime() {
                    r2 = this;
                    long r0 = r2.coolTime
                    return r0
            }

            public double getRollMinusAmplitude() {
                    r2 = this;
                    double r0 = r2.rollMinusAmplitude
                    return r0
            }

            public double getRollPlusAmplitude() {
                    r2 = this;
                    double r0 = r2.rollPlusAmplitude
                    return r0
            }

            public long getRollTime() {
                    r2 = this;
                    long r0 = r2.rollTime
                    return r0
            }

            public long getUserProtectTime() {
                    r2 = this;
                    long r0 = r2.userProtectTime
                    return r0
            }

            public void setCoolTime(long r1) {
                    r0 = this;
                    r0.coolTime = r1
                    return
            }

            public void setRollMinusAmplitude(double r1) {
                    r0 = this;
                    r0.rollMinusAmplitude = r1
                    return
            }

            public void setRollPlusAmplitude(double r1) {
                    r0 = this;
                    r0.rollPlusAmplitude = r1
                    return
            }

            public void setRollTime(long r1) {
                    r0 = this;
                    r0.rollTime = r1
                    return
            }

            public void setUserProtectTime(long r1) {
                    r0 = this;
                    r0.userProtectTime = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class CoolShakeViewBean {

            @com.beizi.fusion.model.JsonNode(key = "coolTime")
            private long coolTime;

            @com.beizi.fusion.model.JsonNode(key = "feedback")
            private int feedback;

            @com.beizi.fusion.model.JsonNode(key = "rotatAmplitude")
            private double rotatAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rotatCount")
            private int rotatCount;

            @com.beizi.fusion.model.JsonNode(key = "shakeCount")
            private int shakeCount;

            @com.beizi.fusion.model.JsonNode(key = "shakeEndAmplitude")
            private double shakeEndAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "shakeStartAmplitude")
            private double shakeStartAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "userProtectTime")
            private long userProtectTime;

            public CoolShakeViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public long getCoolTime() {
                    r2 = this;
                    long r0 = r2.coolTime
                    return r0
            }

            public int getFeedback() {
                    r1 = this;
                    int r0 = r1.feedback
                    return r0
            }

            public double getRotatAmplitude() {
                    r2 = this;
                    double r0 = r2.rotatAmplitude
                    return r0
            }

            public int getRotatCount() {
                    r1 = this;
                    int r0 = r1.rotatCount
                    return r0
            }

            public int getShakeCount() {
                    r1 = this;
                    int r0 = r1.shakeCount
                    return r0
            }

            public double getShakeEndAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeEndAmplitude
                    return r0
            }

            public double getShakeStartAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeStartAmplitude
                    return r0
            }

            public long getUserProtectTime() {
                    r2 = this;
                    long r0 = r2.userProtectTime
                    return r0
            }

            public void setCoolTime(long r1) {
                    r0 = this;
                    r0.coolTime = r1
                    return
            }

            public void setFeedback(int r1) {
                    r0 = this;
                    r0.feedback = r1
                    return
            }

            public void setRotatAmplitude(double r1) {
                    r0 = this;
                    r0.rotatAmplitude = r1
                    return
            }

            public void setRotatCount(int r1) {
                    r0 = this;
                    r0.rotatCount = r1
                    return
            }

            public void setShakeCount(int r1) {
                    r0 = this;
                    r0.shakeCount = r1
                    return
            }

            public void setShakeEndAmplitude(double r1) {
                    r0 = this;
                    r0.shakeEndAmplitude = r1
                    return
            }

            public void setShakeStartAmplitude(double r1) {
                    r0 = this;
                    r0.shakeStartAmplitude = r1
                    return
            }

            public void setUserProtectTime(long r1) {
                    r0 = this;
                    r0.userProtectTime = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class DislikeConfigBean {

            @com.beizi.fusion.model.JsonNode(key = "coolTime")
            private long coolTime;

            @com.beizi.fusion.model.JsonNode(key = "dislikeUuid")
            private java.lang.String dislikeUuid;

            @com.beizi.fusion.model.JsonNode(key = "isHide")
            private int isHide;

            @com.beizi.fusion.model.JsonNode(key = "isShowDialog")
            private int isShowDialog;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataDislikeConfigBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "randomNum")
            private int randomNum;

            public DislikeConfigBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public long getCoolTime() {
                    r2 = this;
                    long r0 = r2.coolTime
                    return r0
            }

            public java.lang.String getDislikeUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.dislikeUuid
                    return r0
            }

            public int getIsHide() {
                    r1 = this;
                    int r0 = r1.isHide
                    return r0
            }

            public int getIsShowDialog() {
                    r1 = this;
                    int r0 = r1.isShowDialog
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataDislikeConfigBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataDislikeConfigBean> r0 = r1.orderData
                    return r0
            }

            public int getRandomNum() {
                    r1 = this;
                    int r0 = r1.randomNum
                    return r0
            }

            public void setCoolTime(long r1) {
                    r0 = this;
                    r0.coolTime = r1
                    return
            }

            public void setDislikeUuid(java.lang.String r1) {
                    r0 = this;
                    r0.dislikeUuid = r1
                    return
            }

            public void setIsHide(int r1) {
                    r0 = this;
                    r0.isHide = r1
                    return
            }

            public void setIsShowDialog(int r1) {
                    r0 = this;
                    r0.isShowDialog = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataDislikeConfigBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setRandomNum(int r1) {
                    r0 = this;
                    r0.randomNum = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class EulerAngleRenderBean {

            @com.beizi.fusion.model.JsonNode(key = "centerX")
            private java.lang.String centerX;

            @com.beizi.fusion.model.JsonNode(key = "centerY")
            private java.lang.String centerY;

            @com.beizi.fusion.model.JsonNode(key = "color")
            private java.lang.String color;

            @com.beizi.fusion.model.JsonNode(key = "height")
            private java.lang.String height;

            @com.beizi.fusion.model.JsonNode(key = "width")
            private java.lang.String width;

            public EulerAngleRenderBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getCenterX() {
                    r1 = this;
                    java.lang.String r0 = r1.centerX
                    return r0
            }

            public java.lang.String getCenterY() {
                    r1 = this;
                    java.lang.String r0 = r1.centerY
                    return r0
            }

            public java.lang.String getColor() {
                    r1 = this;
                    java.lang.String r0 = r1.color
                    return r0
            }

            public java.lang.String getHeight() {
                    r1 = this;
                    java.lang.String r0 = r1.height
                    return r0
            }

            public java.lang.String getWidth() {
                    r1 = this;
                    java.lang.String r0 = r1.width
                    return r0
            }

            public void setCenterX(java.lang.String r1) {
                    r0 = this;
                    r0.centerX = r1
                    return
            }

            public void setCenterY(java.lang.String r1) {
                    r0 = this;
                    r0.centerY = r1
                    return
            }

            public void setColor(java.lang.String r1) {
                    r0 = this;
                    r0.color = r1
                    return
            }

            public void setHeight(java.lang.String r1) {
                    r0 = this;
                    r0.height = r1
                    return
            }

            public void setWidth(java.lang.String r1) {
                    r0 = this;
                    r0.width = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class EulerAngleRuleBean {

            @com.beizi.fusion.model.JsonNode(key = "angle")
            private double angle;

            @com.beizi.fusion.model.JsonNode(key = "axis")
            private java.lang.String axis;

            @com.beizi.fusion.model.JsonNode(key = "direction")
            private java.lang.String direction;

            @com.beizi.fusion.model.JsonNode(key = "pangle")
            private double pangle;

            public EulerAngleRuleBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public double getAngle() {
                    r2 = this;
                    double r0 = r2.angle
                    return r0
            }

            public java.lang.String getAxis() {
                    r1 = this;
                    java.lang.String r0 = r1.axis
                    return r0
            }

            public java.lang.String getDirection() {
                    r1 = this;
                    java.lang.String r0 = r1.direction
                    return r0
            }

            public double getPangle() {
                    r2 = this;
                    double r0 = r2.pangle
                    return r0
            }

            public void setAngle(double r1) {
                    r0 = this;
                    r0.angle = r1
                    return
            }

            public void setAxis(java.lang.String r1) {
                    r0 = this;
                    r0.axis = r1
                    return
            }

            public void setDirection(java.lang.String r1) {
                    r0 = this;
                    r0.direction = r1
                    return
            }

            public void setPangle(double r1) {
                    r0 = this;
                    r0.pangle = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class EulerAngleStyleBean {

            @com.beizi.fusion.model.JsonNode(key = "downloadSubTitle")
            private java.lang.String downloadSubTitle;

            @com.beizi.fusion.model.JsonNode(key = "imgs")
            private java.util.List<java.lang.String> imgs;

            @com.beizi.fusion.model.JsonNode(key = "subTitle")
            private java.lang.String subTitle;

            @com.beizi.fusion.model.JsonNode(key = "title")
            private java.lang.String title;

            public EulerAngleStyleBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getDownloadSubTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.downloadSubTitle
                    return r0
            }

            public java.util.List<java.lang.String> getImgs() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.imgs
                    return r0
            }

            public java.lang.String getSubTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.subTitle
                    return r0
            }

            public java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public void setDownloadSubTitle(java.lang.String r1) {
                    r0 = this;
                    r0.downloadSubTitle = r1
                    return
            }

            public void setImgs(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.imgs = r1
                    return
            }

            public void setSubTitle(java.lang.String r1) {
                    r0 = this;
                    r0.subTitle = r1
                    return
            }

            public void setTitle(java.lang.String r1) {
                    r0 = this;
                    r0.title = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class EulerAngleViewBean {

            @com.beizi.fusion.model.JsonNode(key = "coolRule")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean coolRule;

            @com.beizi.fusion.model.JsonNode(key = "eulerAngleUuid")
            private java.lang.String eulerAngleUuid;

            @com.beizi.fusion.model.JsonNode(key = "nomalRule")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean nomalRule;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "render")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean render;

            public EulerAngleViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean getCoolRule() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r1.coolRule
                    return r0
            }

            public java.lang.String getEulerAngleUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.eulerAngleUuid
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean getNomalRule() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r1.nomalRule
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean> r0 = r1.orderData
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean getRender() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r0 = r1.render
                    return r0
            }

            public void setCoolRule(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean r1) {
                    r0 = this;
                    r0.coolRule = r1
                    return
            }

            public void setEulerAngleUuid(java.lang.String r1) {
                    r0 = this;
                    r0.eulerAngleUuid = r1
                    return
            }

            public void setNomalRule(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean r1) {
                    r0 = this;
                    r0.nomalRule = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setRender(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean r1) {
                    r0 = this;
                    r0.render = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class EulerAngleViewRuleBean {

            @com.beizi.fusion.model.JsonNode(key = "coolTime")
            private long coolTime;

            @com.beizi.fusion.model.JsonNode(key = "passivationTime")
            private int passivationTime;

            @com.beizi.fusion.model.JsonNode(key = "rules")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;

            @com.beizi.fusion.model.JsonNode(key = "style")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleStyleBean style;

            @com.beizi.fusion.model.JsonNode(key = "userProtectTime")
            private long userProtectTime;

            public EulerAngleViewRuleBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public long getCoolTime() {
                    r2 = this;
                    long r0 = r2.coolTime
                    return r0
            }

            public int getPassivationTime() {
                    r1 = this;
                    int r0 = r1.passivationTime
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean> getRules() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRuleBean> r0 = r1.rules
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleStyleBean getStyle() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleStyleBean r0 = r1.style
                    return r0
            }

            public long getUserProtectTime() {
                    r2 = this;
                    long r0 = r2.userProtectTime
                    return r0
            }

            public void setCoolTime(long r1) {
                    r0 = this;
                    r0.coolTime = r1
                    return
            }

            public void setPassivationTime(int r1) {
                    r0 = this;
                    r0.passivationTime = r1
                    return
            }

            public void setRules(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean> r1) {
                    r0 = this;
                    r0.rules = r1
                    return
            }

            public void setStyle(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleStyleBean r1) {
                    r0 = this;
                    r0.style = r1
                    return
            }

            public void setUserProtectTime(long r1) {
                    r0 = this;
                    r0.userProtectTime = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class FullScreenClickBean {

            @com.beizi.fusion.model.JsonNode(key = "fullScreenClickUuid")
            private java.lang.String fullScreenClickUuid;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "randomClickNum")
            private int randomClickNum;

            public FullScreenClickBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getFullScreenClickUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.fullScreenClickUuid
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean> r0 = r1.orderData
                    return r0
            }

            public int getRandomClickNum() {
                    r1 = this;
                    int r0 = r1.randomClickNum
                    return r0
            }

            public void setFullScreenClickUuid(java.lang.String r1) {
                    r0 = this;
                    r0.fullScreenClickUuid = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setRandomClickNum(int r1) {
                    r0 = this;
                    r0.randomClickNum = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataDislikeConfigBean {

            @com.beizi.fusion.model.JsonNode(key = "dislike")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean dislike;

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            public OrderDataDislikeConfigBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean getDislike() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$DislikeConfigBean r0 = r1.dislike
                    return r0
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public void setDislike(com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean r1) {
                    r0 = this;
                    r0.dislike = r1
                    return
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataEulerAngleViewBean {

            @com.beizi.fusion.model.JsonNode(key = "eulerAngleRule")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleRule;

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            public OrderDataEulerAngleViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean getEulerAngleRule() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r1.eulerAngleRule
                    return r0
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public void setEulerAngleRule(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean r1) {
                    r0 = this;
                    r0.eulerAngleRule = r1
                    return
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataFullScreenClickBean {

            @com.beizi.fusion.model.JsonNode(key = "fullScreenClick")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClick;

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            public OrderDataFullScreenClickBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean getFullScreenClick() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r0 = r1.fullScreenClick
                    return r0
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public void setFullScreenClick(com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean r1) {
                    r0 = this;
                    r0.fullScreenClick = r1
                    return
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataRegionalClickViewBean {

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            @com.beizi.fusion.model.JsonNode(key = "regionalClickView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickView;

            public OrderDataRegionalClickViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean getRegionalClickView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r0 = r1.regionalClickView
                    return r0
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }

            public void setRegionalClickView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean r1) {
                    r0 = this;
                    r0.regionalClickView = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataRollViewBean {

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            @com.beizi.fusion.model.JsonNode(key = "rollView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean rollView;

            public OrderDataRollViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean getRollView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$RollViewBean r0 = r1.rollView
                    return r0
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }

            public void setRollView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean r1) {
                    r0 = this;
                    r0.rollView = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataScrollViewOrderBean {

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            @com.beizi.fusion.model.JsonNode(key = "scrollClick")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean scrollClick;

            public OrderDataScrollViewOrderBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean getScrollClick() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r1.scrollClick
                    return r0
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }

            public void setScrollClick(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean r1) {
                    r0 = this;
                    r0.scrollClick = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class OrderDataShakeViewBean {

            @com.beizi.fusion.model.JsonNode(key = "orderList")
            private java.util.List<java.lang.String> orderList;

            @com.beizi.fusion.model.JsonNode(key = "shakeView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean shakeView;

            public OrderDataShakeViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.util.List<java.lang.String> getOrderList() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.orderList
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean getShakeView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r1.shakeView
                    return r0
            }

            public void setOrderList(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.orderList = r1
                    return
            }

            public void setShakeView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r1) {
                    r0 = this;
                    r0.shakeView = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class PercentPositionBean {

            @com.beizi.fusion.model.JsonNode(key = "centerX")
            private java.lang.String centerX;

            @com.beizi.fusion.model.JsonNode(key = "centerY")
            private java.lang.String centerY;

            @com.beizi.fusion.model.JsonNode(key = "height")
            private java.lang.String height;

            @com.beizi.fusion.model.JsonNode(key = "width")
            private java.lang.String width;

            public PercentPositionBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getCenterX() {
                    r1 = this;
                    java.lang.String r0 = r1.centerX
                    return r0
            }

            public java.lang.String getCenterY() {
                    r1 = this;
                    java.lang.String r0 = r1.centerY
                    return r0
            }

            public java.lang.String getHeight() {
                    r1 = this;
                    java.lang.String r0 = r1.height
                    return r0
            }

            public java.lang.String getWidth() {
                    r1 = this;
                    java.lang.String r0 = r1.width
                    return r0
            }

            public void setCenterX(java.lang.String r1) {
                    r0 = this;
                    r0.centerX = r1
                    return
            }

            public void setCenterY(java.lang.String r1) {
                    r0 = this;
                    r0.centerY = r1
                    return
            }

            public void setHeight(java.lang.String r1) {
                    r0 = this;
                    r0.height = r1
                    return
            }

            public void setWidth(java.lang.String r1) {
                    r0 = this;
                    r0.width = r1
                    return
            }

            @androidx.annotation.NonNull
            public java.lang.String toString() {
                    r3 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "PercentPositionBean{centerX='"
                    r0.append(r1)
                    java.lang.String r1 = r3.centerX
                    r0.append(r1)
                    r1 = 39
                    r0.append(r1)
                    java.lang.String r2 = ", centerY='"
                    r0.append(r2)
                    java.lang.String r2 = r3.centerY
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r2 = ", width='"
                    r0.append(r2)
                    java.lang.String r2 = r3.width
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r2 = ", height='"
                    r0.append(r2)
                    java.lang.String r2 = r3.height
                    r0.append(r2)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class PriceDictBean {

            @com.beizi.fusion.model.JsonNode(key = "name")
            private java.lang.String name;

            @com.beizi.fusion.model.JsonNode(key = "price")
            private int price;

            public PriceDictBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getName() {
                    r1 = this;
                    java.lang.String r0 = r1.name
                    return r0
            }

            public int getPrice() {
                    r1 = this;
                    int r0 = r1.price
                    return r0
            }

            public void setName(java.lang.String r1) {
                    r0 = this;
                    r0.name = r1
                    return
            }

            public void setPrice(int r1) {
                    r0 = this;
                    r0.price = r1
                    return
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "PriceDictBean{name='"
                    r0.append(r1)
                    java.lang.String r1 = r2.name
                    r0.append(r1)
                    r1 = 39
                    r0.append(r1)
                    java.lang.String r1 = ", price="
                    r0.append(r1)
                    int r1 = r2.price
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class RegionalClickViewBean {

            @com.beizi.fusion.model.JsonNode(key = "backgroundAlpha")
            private double backgroundAlpha;

            @com.beizi.fusion.model.JsonNode(key = "backgroundColor")
            private java.lang.String backgroundColor;

            @com.beizi.fusion.model.JsonNode(key = "downloadTitle")
            private java.lang.String downloadTitle;

            @com.beizi.fusion.model.JsonNode(key = "isDisableClick")
            private int isDisableClick;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "position")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean position;

            @com.beizi.fusion.model.JsonNode(key = "regionalClickUuid")
            private java.lang.String regionalClickUuid;

            @com.beizi.fusion.model.JsonNode(key = "title")
            private java.lang.String title;

            @com.beizi.fusion.model.JsonNode(key = "titleColor")
            private java.lang.String titleColor;

            public RegionalClickViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public double getBackgroundAlpha() {
                    r2 = this;
                    double r0 = r2.backgroundAlpha
                    return r0
            }

            public java.lang.String getBackgroundColor() {
                    r1 = this;
                    java.lang.String r0 = r1.backgroundColor
                    return r0
            }

            public java.lang.String getDownloadTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.downloadTitle
                    return r0
            }

            public int getIsDisableClick() {
                    r1 = this;
                    int r0 = r1.isDisableClick
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataRegionalClickViewBean> r0 = r1.orderData
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean getPosition() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r0 = r1.position
                    return r0
            }

            public java.lang.String getRegionalClickUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.regionalClickUuid
                    return r0
            }

            public java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public java.lang.String getTitleColor() {
                    r1 = this;
                    java.lang.String r0 = r1.titleColor
                    return r0
            }

            public void setBackgroundAlpha(double r1) {
                    r0 = this;
                    r0.backgroundAlpha = r1
                    return
            }

            public void setBackgroundColor(java.lang.String r1) {
                    r0 = this;
                    r0.backgroundColor = r1
                    return
            }

            public void setDownloadTitle(java.lang.String r1) {
                    r0 = this;
                    r0.downloadTitle = r1
                    return
            }

            public void setIsDisableClick(int r1) {
                    r0 = this;
                    r0.isDisableClick = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setPosition(com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r1) {
                    r0 = this;
                    r0.position = r1
                    return
            }

            public void setRegionalClickUuid(java.lang.String r1) {
                    r0 = this;
                    r0.regionalClickUuid = r1
                    return
            }

            public void setTitle(java.lang.String r1) {
                    r0 = this;
                    r0.title = r1
                    return
            }

            public void setTitleColor(java.lang.String r1) {
                    r0 = this;
                    r0.titleColor = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class RenderAds {

            @com.beizi.fusion.model.JsonNode(key = "actionCoordinate")
            private java.lang.String actionCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "adCoordinate")
            private java.lang.String adCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "autoClose")
            private java.lang.String autoClose;

            @com.beizi.fusion.model.JsonNode(key = "bgCoordinate")
            private java.lang.String bgCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "cec")
            private java.lang.String cec;

            @com.beizi.fusion.model.JsonNode(key = "clickView")
            private java.util.List<java.lang.String> clickView;

            @com.beizi.fusion.model.JsonNode(key = "closeCoordinate")
            private java.lang.String closeCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "descCoordinate")
            private java.lang.String descCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "iconCoordinate")
            private java.lang.String iconCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "imageCoordinate")
            private java.lang.String imageCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "maxTime")
            private java.lang.String maxTime;

            @com.beizi.fusion.model.JsonNode(key = "minTime")
            private java.lang.String minTime;

            @com.beizi.fusion.model.JsonNode(key = "renderAdsUuid")
            private java.lang.String renderAdsUuid;

            @com.beizi.fusion.model.JsonNode(key = "rmc")
            private java.lang.String rmc;

            @com.beizi.fusion.model.JsonNode(key = "scrollCoordinate")
            private java.lang.String scrollCoordinate;

            @com.beizi.fusion.model.JsonNode(key = "slac")
            private java.lang.String slac;

            @com.beizi.fusion.model.JsonNode(key = "slc")
            private java.lang.String slc;

            @com.beizi.fusion.model.JsonNode(key = "titleCoordinate")
            private java.lang.String titleCoordinate;

            public RenderAds() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private int strToInt(java.lang.String r1) {
                    r0 = this;
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L5
                    return r1
                L5:
                    r1 = 0
                    return r1
            }

            public java.lang.String getActionCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.actionCoordinate
                    return r0
            }

            public java.lang.String getAdCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.adCoordinate
                    return r0
            }

            public int getAutoClose() {
                    r1 = this;
                    java.lang.String r0 = r1.autoClose
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public java.lang.String getBgCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.bgCoordinate
                    return r0
            }

            public int getCec() {
                    r1 = this;
                    java.lang.String r0 = r1.cec
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public java.util.List<java.lang.String> getClickView() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.clickView
                    return r0
            }

            public java.lang.String getCloseCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.closeCoordinate
                    return r0
            }

            public java.lang.String getDescCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.descCoordinate
                    return r0
            }

            public java.lang.String getIconCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.iconCoordinate
                    return r0
            }

            public java.lang.String getImageCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.imageCoordinate
                    return r0
            }

            public int getMaxTime() {
                    r1 = this;
                    java.lang.String r0 = r1.maxTime
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public int getMinTime() {
                    r1 = this;
                    java.lang.String r0 = r1.minTime
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public java.lang.String getRenderAdsUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.renderAdsUuid
                    return r0
            }

            public int getRmc() {
                    r1 = this;
                    java.lang.String r0 = r1.rmc
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public java.lang.String getScrollCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.scrollCoordinate
                    return r0
            }

            public int getSlac() {
                    r1 = this;
                    java.lang.String r0 = r1.slac
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public int getSlc() {
                    r1 = this;
                    java.lang.String r0 = r1.slc
                    int r0 = r1.strToInt(r0)
                    return r0
            }

            public java.lang.String getTitleCoordinate() {
                    r1 = this;
                    java.lang.String r0 = r1.titleCoordinate
                    return r0
            }

            public void setActionCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.actionCoordinate = r1
                    return
            }

            public void setAdCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.adCoordinate = r1
                    return
            }

            public void setAutoClose(java.lang.String r1) {
                    r0 = this;
                    r0.autoClose = r1
                    return
            }

            public void setBgCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.bgCoordinate = r1
                    return
            }

            public void setCec(java.lang.String r1) {
                    r0 = this;
                    r0.cec = r1
                    return
            }

            public void setClickView(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.clickView = r1
                    return
            }

            public void setCloseCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.closeCoordinate = r1
                    return
            }

            public void setDescCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.descCoordinate = r1
                    return
            }

            public void setIconCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.iconCoordinate = r1
                    return
            }

            public void setImageCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.imageCoordinate = r1
                    return
            }

            public void setMaxTime(java.lang.String r1) {
                    r0 = this;
                    r0.maxTime = r1
                    return
            }

            public void setMinTime(java.lang.String r1) {
                    r0 = this;
                    r0.minTime = r1
                    return
            }

            public void setRenderAdsUuid(java.lang.String r1) {
                    r0 = this;
                    r0.renderAdsUuid = r1
                    return
            }

            public void setRmc(java.lang.String r1) {
                    r0 = this;
                    r0.rmc = r1
                    return
            }

            public void setScrollCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.scrollCoordinate = r1
                    return
            }

            public void setSlac(java.lang.String r1) {
                    r0 = this;
                    r0.slac = r1
                    return
            }

            public void setSlc(java.lang.String r1) {
                    r0 = this;
                    r0.slc = r1
                    return
            }

            public void setTitleCoordinate(java.lang.String r1) {
                    r0 = this;
                    r0.titleCoordinate = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class RenderRulesBean {

            @com.beizi.fusion.model.JsonNode(key = "results")
            private java.lang.Integer[] results;

            @com.beizi.fusion.model.JsonNode(key = "type")
            private java.lang.String type;

            public RenderRulesBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.Integer[] getResults() {
                    r1 = this;
                    java.lang.Integer[] r0 = r1.results
                    return r0
            }

            public java.lang.String getType() {
                    r1 = this;
                    java.lang.String r0 = r1.type
                    return r0
            }

            public void setResults(java.lang.Integer[] r1) {
                    r0 = this;
                    r0.results = r1
                    return
            }

            public void setType(java.lang.String r1) {
                    r0 = this;
                    r0.type = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class RollViewBean {

            @com.beizi.fusion.model.JsonNode(key = "bgColor")
            private java.lang.String bgColor;

            @com.beizi.fusion.model.JsonNode(key = "coolRollView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolRollViewBean coolRollView;

            @com.beizi.fusion.model.JsonNode(key = "downloadSubTitle")
            private java.lang.String downloadSubTitle;

            @com.beizi.fusion.model.JsonNode(key = "isClick")
            private int isClick;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRollViewBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "position")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean position;

            @com.beizi.fusion.model.JsonNode(key = "rollMinusAmplitude")
            private double rollMinusAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rollPlusAmplitude")
            private double rollPlusAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rollTime")
            private long rollTime;

            @com.beizi.fusion.model.JsonNode(key = "rollViewUuid")
            private java.lang.String rollViewUuid;

            @com.beizi.fusion.model.JsonNode(key = "subTitle")
            private java.lang.String subTitle;

            @com.beizi.fusion.model.JsonNode(key = "title")
            private java.lang.String title;

            public RollViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getBgColor() {
                    r1 = this;
                    java.lang.String r0 = r1.bgColor
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolRollViewBean getCoolRollView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolRollViewBean r0 = r1.coolRollView
                    return r0
            }

            public java.lang.String getDownloadSubTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.downloadSubTitle
                    return r0
            }

            public int getIsClick() {
                    r1 = this;
                    int r0 = r1.isClick
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRollViewBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataRollViewBean> r0 = r1.orderData
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean getPosition() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r0 = r1.position
                    return r0
            }

            public double getRollMinusAmplitude() {
                    r2 = this;
                    double r0 = r2.rollMinusAmplitude
                    return r0
            }

            public double getRollPlusAmplitude() {
                    r2 = this;
                    double r0 = r2.rollPlusAmplitude
                    return r0
            }

            public long getRollTime() {
                    r2 = this;
                    long r0 = r2.rollTime
                    return r0
            }

            public java.lang.String getRollViewUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.rollViewUuid
                    return r0
            }

            public java.lang.String getSubTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.subTitle
                    return r0
            }

            public java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public void setBgColor(java.lang.String r1) {
                    r0 = this;
                    r0.bgColor = r1
                    return
            }

            public void setCoolRollView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolRollViewBean r1) {
                    r0 = this;
                    r0.coolRollView = r1
                    return
            }

            public void setDownloadSubTitle(java.lang.String r1) {
                    r0 = this;
                    r0.downloadSubTitle = r1
                    return
            }

            public void setIsClick(int r1) {
                    r0 = this;
                    r0.isClick = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataRollViewBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setPosition(com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r1) {
                    r0 = this;
                    r0.position = r1
                    return
            }

            public void setRollMinusAmplitude(double r1) {
                    r0 = this;
                    r0.rollMinusAmplitude = r1
                    return
            }

            public void setRollPlusAmplitude(double r1) {
                    r0 = this;
                    r0.rollPlusAmplitude = r1
                    return
            }

            public void setRollTime(long r1) {
                    r0 = this;
                    r0.rollTime = r1
                    return
            }

            public void setRollViewUuid(java.lang.String r1) {
                    r0 = this;
                    r0.rollViewUuid = r1
                    return
            }

            public void setSubTitle(java.lang.String r1) {
                    r0 = this;
                    r0.subTitle = r1
                    return
            }

            public void setTitle(java.lang.String r1) {
                    r0 = this;
                    r0.title = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class ScrollClickBean {

            @com.beizi.fusion.model.JsonNode(key = "details")
            private java.lang.String details;

            @com.beizi.fusion.model.JsonNode(key = "detailsFont")
            private int detailsFont;

            @com.beizi.fusion.model.JsonNode(key = "downloadDetails")
            private java.lang.String downloadDetails;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "position")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickPositionBean position;

            @com.beizi.fusion.model.JsonNode(key = "randomClickNum")
            private int randomClickNum;

            @com.beizi.fusion.model.JsonNode(key = "randomClickTime")
            private int randomClickTime;

            @com.beizi.fusion.model.JsonNode(key = "scrollClickUuid")
            private java.lang.String scrollClickUuid;

            @com.beizi.fusion.model.JsonNode(key = "scrollDirection")
            private java.lang.String scrollDirection;

            @com.beizi.fusion.model.JsonNode(key = "scrollDistance")
            private int scrollDistance;

            @com.beizi.fusion.model.JsonNode(key = "title")
            private java.lang.String title;

            @com.beizi.fusion.model.JsonNode(key = "titleFont")
            private int titleFont;

            public ScrollClickBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getDetails() {
                    r1 = this;
                    java.lang.String r0 = r1.details
                    return r0
            }

            public int getDetailsFont() {
                    r1 = this;
                    int r0 = r1.detailsFont
                    return r0
            }

            public java.lang.String getDownloadDetails() {
                    r1 = this;
                    java.lang.String r0 = r1.downloadDetails
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataScrollViewOrderBean> r0 = r1.orderData
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickPositionBean getPosition() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickPositionBean r0 = r1.position
                    return r0
            }

            public int getRandomClickNum() {
                    r1 = this;
                    int r0 = r1.randomClickNum
                    return r0
            }

            public int getRandomClickTime() {
                    r1 = this;
                    int r0 = r1.randomClickTime
                    return r0
            }

            public java.lang.String getScrollClickUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.scrollClickUuid
                    return r0
            }

            public java.lang.String getScrollDirection() {
                    r1 = this;
                    java.lang.String r0 = r1.scrollDirection
                    return r0
            }

            public int getScrollDistance() {
                    r1 = this;
                    int r0 = r1.scrollDistance
                    return r0
            }

            public java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public int getTitleFont() {
                    r1 = this;
                    int r0 = r1.titleFont
                    return r0
            }

            public void setDetails(java.lang.String r1) {
                    r0 = this;
                    r0.details = r1
                    return
            }

            public void setDetailsFont(int r1) {
                    r0 = this;
                    r0.detailsFont = r1
                    return
            }

            public void setDownloadDetails(java.lang.String r1) {
                    r0 = this;
                    r0.downloadDetails = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setPosition(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickPositionBean r1) {
                    r0 = this;
                    r0.position = r1
                    return
            }

            public void setRandomClickNum(int r1) {
                    r0 = this;
                    r0.randomClickNum = r1
                    return
            }

            public void setRandomClickTime(int r1) {
                    r0 = this;
                    r0.randomClickTime = r1
                    return
            }

            public void setScrollClickUuid(java.lang.String r1) {
                    r0 = this;
                    r0.scrollClickUuid = r1
                    return
            }

            public void setScrollDirection(java.lang.String r1) {
                    r0 = this;
                    r0.scrollDirection = r1
                    return
            }

            public void setScrollDistance(int r1) {
                    r0 = this;
                    r0.scrollDistance = r1
                    return
            }

            public void setTitle(java.lang.String r1) {
                    r0 = this;
                    r0.title = r1
                    return
            }

            public void setTitleFont(int r1) {
                    r0 = this;
                    r0.titleFont = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class ScrollClickPositionBean {

            @com.beizi.fusion.model.JsonNode(key = "centerX")
            private java.lang.String centerX;

            @com.beizi.fusion.model.JsonNode(key = "height")
            private java.lang.String height;

            @com.beizi.fusion.model.JsonNode(key = "top")
            private java.lang.String top;

            @com.beizi.fusion.model.JsonNode(key = "width")
            private java.lang.String width;

            public ScrollClickPositionBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public java.lang.String getCenterX() {
                    r1 = this;
                    java.lang.String r0 = r1.centerX
                    return r0
            }

            public java.lang.String getHeight() {
                    r1 = this;
                    java.lang.String r0 = r1.height
                    return r0
            }

            public java.lang.String getTop() {
                    r1 = this;
                    java.lang.String r0 = r1.top
                    return r0
            }

            public java.lang.String getWidth() {
                    r1 = this;
                    java.lang.String r0 = r1.width
                    return r0
            }

            public void setCenterX(java.lang.String r1) {
                    r0 = this;
                    r0.centerX = r1
                    return
            }

            public void setHeight(java.lang.String r1) {
                    r0 = this;
                    r0.height = r1
                    return
            }

            public void setTop(java.lang.String r1) {
                    r0 = this;
                    r0.top = r1
                    return
            }

            public void setWidth(java.lang.String r1) {
                    r0 = this;
                    r0.width = r1
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class ShakeViewBean {

            @com.beizi.fusion.model.JsonNode(key = "aliaseShakeView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeView;

            @com.beizi.fusion.model.JsonNode(key = "animationInterval")
            private int animationInterval;

            @com.beizi.fusion.model.JsonNode(key = "clkremove")
            private int clkremove;

            @com.beizi.fusion.model.JsonNode(key = "compliantAngle")
            private int compliantAngle;

            @com.beizi.fusion.model.JsonNode(key = "coolShakeView")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeView;

            @com.beizi.fusion.model.JsonNode(key = "downloadTitle")
            private java.lang.String downloadTitle;

            @com.beizi.fusion.model.JsonNode(key = "feedback")
            private int feedback;

            @com.beizi.fusion.model.JsonNode(key = "imageURL")
            private java.util.List<java.lang.String> imageURL;

            @com.beizi.fusion.model.JsonNode(key = "isHideAnim")
            private int isHideAnim;

            @com.beizi.fusion.model.JsonNode(key = "orderData")
            private java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> orderData;

            @com.beizi.fusion.model.JsonNode(key = "position")
            private com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean position;

            @com.beizi.fusion.model.JsonNode(key = "randomClickNum")
            private int randomClickNum;

            @com.beizi.fusion.model.JsonNode(key = "randomClickTime")
            private int randomClickTime;

            @com.beizi.fusion.model.JsonNode(key = "regulatoryAngle")
            private int regulatoryAngle;

            @com.beizi.fusion.model.JsonNode(key = "renderRate")
            private int renderRate;

            @com.beizi.fusion.model.JsonNode(key = "returnAngle")
            private boolean returnAngle;

            @com.beizi.fusion.model.JsonNode(key = "rotatAmplitude")
            private double rotatAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "rotatCount")
            private int rotatCount;

            @com.beizi.fusion.model.JsonNode(key = "sensorParam")
            private int sensorParam;

            @com.beizi.fusion.model.JsonNode(key = "shakeCount")
            private int shakeCount;

            @com.beizi.fusion.model.JsonNode(key = "shakeEndAmplitude")
            private double shakeEndAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "shakeStartAmplitude")
            private double shakeStartAmplitude;

            @com.beizi.fusion.model.JsonNode(key = "shakeViewUuid")
            private java.lang.String shakeViewUuid;

            @com.beizi.fusion.model.JsonNode(key = "title")
            private java.lang.String title;

            public ShakeViewBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.AliaseShakeViewBean getAliaseShakeView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r1.aliaseShakeView
                    return r0
            }

            public int getAnimationInterval() {
                    r1 = this;
                    int r0 = r1.animationInterval
                    return r0
            }

            public int getClkremove() {
                    r1 = this;
                    int r0 = r1.clkremove
                    return r0
            }

            public int getCompliantAngle() {
                    r1 = this;
                    int r0 = r1.compliantAngle
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean getCoolShakeView() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r1.coolShakeView
                    return r0
            }

            public java.lang.String getDownloadTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.downloadTitle
                    return r0
            }

            public int getFeedback() {
                    r1 = this;
                    int r0 = r1.feedback
                    return r0
            }

            public java.util.List<java.lang.String> getImageURL() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.imageURL
                    return r0
            }

            public int getIsHideAnim() {
                    r1 = this;
                    int r0 = r1.isHideAnim
                    return r0
            }

            public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> getOrderData() {
                    r1 = this;
                    java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean> r0 = r1.orderData
                    return r0
            }

            public com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean getPosition() {
                    r1 = this;
                    com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r0 = r1.position
                    return r0
            }

            public int getRandomClickNum() {
                    r1 = this;
                    int r0 = r1.randomClickNum
                    return r0
            }

            public int getRandomClickTime() {
                    r1 = this;
                    int r0 = r1.randomClickTime
                    return r0
            }

            public int getRegulatoryAngle() {
                    r1 = this;
                    int r0 = r1.regulatoryAngle
                    return r0
            }

            public int getRenderRate() {
                    r1 = this;
                    int r0 = r1.renderRate
                    return r0
            }

            public double getRotatAmplitude() {
                    r2 = this;
                    double r0 = r2.rotatAmplitude
                    return r0
            }

            public int getRotatCount() {
                    r1 = this;
                    int r0 = r1.rotatCount
                    return r0
            }

            public int getSensorParam() {
                    r1 = this;
                    int r0 = r1.sensorParam
                    return r0
            }

            public int getShakeCount() {
                    r1 = this;
                    int r0 = r1.shakeCount
                    return r0
            }

            public double getShakeEndAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeEndAmplitude
                    return r0
            }

            public double getShakeStartAmplitude() {
                    r2 = this;
                    double r0 = r2.shakeStartAmplitude
                    return r0
            }

            public java.lang.String getShakeViewUuid() {
                    r1 = this;
                    java.lang.String r0 = r1.shakeViewUuid
                    return r0
            }

            public java.lang.String getTitle() {
                    r1 = this;
                    java.lang.String r0 = r1.title
                    return r0
            }

            public boolean isReturnAngle() {
                    r1 = this;
                    boolean r0 = r1.returnAngle
                    return r0
            }

            public void setAliaseShakeView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.AliaseShakeViewBean r1) {
                    r0 = this;
                    r0.aliaseShakeView = r1
                    return
            }

            public void setAnimationInterval(int r1) {
                    r0 = this;
                    r0.animationInterval = r1
                    return
            }

            public void setClkremove(int r1) {
                    r0 = this;
                    r0.clkremove = r1
                    return
            }

            public void setCompliantAngle(int r1) {
                    r0 = this;
                    r0.compliantAngle = r1
                    return
            }

            public void setCoolShakeView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r1) {
                    r0 = this;
                    r0.coolShakeView = r1
                    return
            }

            public void setDownloadTitle(java.lang.String r1) {
                    r0 = this;
                    r0.downloadTitle = r1
                    return
            }

            public void setFeedback(int r1) {
                    r0 = this;
                    r0.feedback = r1
                    return
            }

            public void setImageURL(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.imageURL = r1
                    return
            }

            public void setIsHideAnim(int r1) {
                    r0 = this;
                    r0.isHideAnim = r1
                    return
            }

            public void setOrderData(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> r1) {
                    r0 = this;
                    r0.orderData = r1
                    return
            }

            public void setPosition(com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r1) {
                    r0 = this;
                    r0.position = r1
                    return
            }

            public void setRandomClickNum(int r1) {
                    r0 = this;
                    r0.randomClickNum = r1
                    return
            }

            public void setRandomClickTime(int r1) {
                    r0 = this;
                    r0.randomClickTime = r1
                    return
            }

            public void setRegulatoryAngle(int r1) {
                    r0 = this;
                    r0.regulatoryAngle = r1
                    return
            }

            public void setRenderRate(int r1) {
                    r0 = this;
                    r0.renderRate = r1
                    return
            }

            public void setReturnAngle(boolean r1) {
                    r0 = this;
                    r0.returnAngle = r1
                    return
            }

            public void setRotatAmplitude(double r1) {
                    r0 = this;
                    r0.rotatAmplitude = r1
                    return
            }

            public void setRotatCount(int r1) {
                    r0 = this;
                    r0.rotatCount = r1
                    return
            }

            public void setSensorParam(int r1) {
                    r0 = this;
                    r0.sensorParam = r1
                    return
            }

            public void setShakeCount(int r1) {
                    r0 = this;
                    r0.shakeCount = r1
                    return
            }

            public void setShakeEndAmplitude(double r1) {
                    r0 = this;
                    r0.shakeEndAmplitude = r1
                    return
            }

            public void setShakeStartAmplitude(double r1) {
                    r0 = this;
                    r0.shakeStartAmplitude = r1
                    return
            }

            public void setShakeViewUuid(java.lang.String r1) {
                    r0 = this;
                    r0.shakeViewUuid = r1
                    return
            }

            public void setTitle(java.lang.String r1) {
                    r0 = this;
                    r0.title = r1
                    return
            }
        }

        public BuyerBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.BuyerBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r0 = com.beizi.fusion.model.AdSpacesBean.BuyerBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                java.lang.Object r0 = super.clone()
                com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean) r0
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m1clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean r0 = r1.clone()
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.AdSizeBean getAdSize() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$AdSizeBean r0 = r1.adSize
                return r0
        }

        public java.lang.String getAdType() {
                r1 = this;
                java.lang.String r0 = r1.adType
                return r0
        }

        public java.lang.String getAdWorker() {
                r1 = this;
                java.lang.String r0 = r1.adWorker
                return r0
        }

        public java.lang.String getAppId() {
                r1 = this;
                java.lang.String r0 = r1.appId
                return r0
        }

        public double getAvgPrice() {
                r2 = this;
                double r0 = r2.avgPrice
                return r0
        }

        public double getBidPrice() {
                r2 = this;
                double r0 = r2.bidPrice
                return r0
        }

        public java.lang.String getBidType() {
                r1 = this;
                java.lang.String r0 = r1.bidType
                return r0
        }

        public java.lang.String getBuyerSpaceUuId() {
                r1 = this;
                java.lang.String r0 = r1.buyerSpaceUuId
                return r0
        }

        public int getCache() {
                r1 = this;
                int r0 = r1.cache
                return r0
        }

        public int getCacheNum() {
                r1 = this;
                int r0 = r1.cacheNum
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean> getCallBackStrategy() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$CallBackStrategyBean> r0 = r1.callBackStrategy
                return r0
        }

        public java.lang.String getCallBackStrategyUuid() {
                r1 = this;
                java.lang.String r0 = r1.callBackStrategyUuid
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.ComplainBean getComplain() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$ComplainBean r0 = r1.complain
                return r0
        }

        public int getDirectDownload() {
                r1 = this;
                int r0 = r1.directDownload
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean getDislikeConfig() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$DislikeConfigBean r0 = r1.dislikeConfig
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean getEulerAngleRule() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r1.eulerAngleRule
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.FilterBean getFilter() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$FilterBean r0 = r1.filter
                return r0
        }

        public java.lang.String getFilterSsid() {
                r1 = this;
                java.lang.String r0 = r1.filterSsid
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean getFullScreenClick() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$FullScreenClickBean r0 = r1.fullScreenClick
                return r0
        }

        public java.lang.String getId() {
                r1 = this;
                java.lang.String r0 = r1.id
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderRulesBean> getInteractionRules() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderRulesBean> r0 = r1.interactionRules
                return r0
        }

        public int getIsAnimation() {
                r1 = this;
                int r0 = r1.isAnimation
                return r0
        }

        public int getIsHideInteraction() {
                r1 = this;
                int r0 = r1.isHideInteraction
                return r0
        }

        public int getIsImageSpeed() {
                r1 = this;
                int r0 = r1.isImageSpeed
                return r0
        }

        public int getIsPlaceHolder() {
                r1 = this;
                int r0 = r1.isPlaceHolder
                return r0
        }

        public int getIsSendBidData() {
                r1 = this;
                int r0 = r1.isSendBidData
                return r0
        }

        public int getLastTime() {
                r1 = this;
                int r0 = r1.lastTime
                return r0
        }

        public int getMinShowTime() {
                r1 = this;
                int r0 = r1.minShowTime
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.NativeOptimizeBean getNativeOptimize() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$NativeOptimizeBean r0 = r1.nativeOptimize
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.NativeRuleBean getNativeRule() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$NativeRuleBean r0 = r1.nativeRule
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.PriceDictBean> getPriceDict() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean$PriceDictBean> r0 = r1.priceDict
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean getRegionalClickView() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$RegionalClickViewBean r0 = r1.regionalClickView
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderAds getRenderAds() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$RenderAds r0 = r1.renderAds
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> getRenderView() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RenderViewBean> r0 = r1.renderView
                return r0
        }

        public java.lang.String getRenderViewSsid() {
                r1 = this;
                java.lang.String r0 = r1.renderViewSsid
                return r0
        }

        public int getReqTimeOutType() {
                r1 = this;
                int r0 = r1.reqTimeOutType
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean getRollView() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$RollViewBean r0 = r1.rollView
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.ScreenConfigVoBean> getScreenConfigVo() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$ScreenConfigVoBean> r0 = r1.screenConfigVo
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean getScrollClick() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$ScrollClickBean r0 = r1.scrollClick
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean getShakeView() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r1.shakeView
                return r0
        }

        public int getSizeRatio() {
                r1 = this;
                int r0 = r1.sizeRatio
                return r0
        }

        public java.lang.String getSpaceId() {
                r1 = this;
                java.lang.String r0 = r1.spaceId
                return r0
        }

        public int getTemplate() {
                r1 = this;
                int r0 = r1.template
                return r0
        }

        public int getWaitTime() {
                r1 = this;
                int r0 = r1.waitTime
                return r0
        }

        public java.lang.String getZone() {
                r1 = this;
                java.lang.String r0 = r1.zone
                return r0
        }

        public void setAdSize(com.beizi.fusion.model.AdSpacesBean.AdSizeBean r1) {
                r0 = this;
                r0.adSize = r1
                return
        }

        public void setAdType(java.lang.String r1) {
                r0 = this;
                r0.adType = r1
                return
        }

        public void setAdWorker(java.lang.String r1) {
                r0 = this;
                r0.adWorker = r1
                return
        }

        public void setAppId(java.lang.String r1) {
                r0 = this;
                r0.appId = r1
                return
        }

        public void setAvgPrice(double r1) {
                r0 = this;
                r0.avgPrice = r1
                return
        }

        public void setBidPrice(double r1) {
                r0 = this;
                r0.bidPrice = r1
                return
        }

        public void setBidType(java.lang.String r1) {
                r0 = this;
                r0.bidType = r1
                return
        }

        public void setBuyerSpaceUuId(java.lang.String r1) {
                r0 = this;
                r0.buyerSpaceUuId = r1
                return
        }

        public void setCache(int r1) {
                r0 = this;
                r0.cache = r1
                return
        }

        public void setCacheNum(int r1) {
                r0 = this;
                r0.cacheNum = r1
                return
        }

        public void setCallBackStrategy(java.util.List<com.beizi.fusion.model.AdSpacesBean.CallBackStrategyBean> r1) {
                r0 = this;
                r0.callBackStrategy = r1
                return
        }

        public void setCallBackStrategyUuid(java.lang.String r1) {
                r0 = this;
                r0.callBackStrategyUuid = r1
                return
        }

        public void setComplain(com.beizi.fusion.model.AdSpacesBean.ComplainBean r1) {
                r0 = this;
                r0.complain = r1
                return
        }

        public void setDirectDownload(int r1) {
                r0 = this;
                r0.directDownload = r1
                return
        }

        public void setDislikeConfig(com.beizi.fusion.model.AdSpacesBean.BuyerBean.DislikeConfigBean r1) {
                r0 = this;
                r0.dislikeConfig = r1
                return
        }

        public void setEulerAngleRule(com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean r1) {
                r0 = this;
                r0.eulerAngleRule = r1
                return
        }

        public void setFilter(com.beizi.fusion.model.AdSpacesBean.FilterBean r1) {
                r0 = this;
                r0.filter = r1
                return
        }

        public void setFilterSsid(java.lang.String r1) {
                r0 = this;
                r0.filterSsid = r1
                return
        }

        public void setFullScreenClick(com.beizi.fusion.model.AdSpacesBean.BuyerBean.FullScreenClickBean r1) {
                r0 = this;
                r0.fullScreenClick = r1
                return
        }

        public void setId(java.lang.String r1) {
                r0 = this;
                r0.id = r1
                return
        }

        public void setInteractionRules(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderRulesBean> r1) {
                r0 = this;
                r0.interactionRules = r1
                return
        }

        public void setIsAnimation(int r1) {
                r0 = this;
                r0.isAnimation = r1
                return
        }

        public void setIsHideInteraction(int r1) {
                r0 = this;
                r0.isHideInteraction = r1
                return
        }

        public void setIsImageSpeed(int r1) {
                r0 = this;
                r0.isImageSpeed = r1
                return
        }

        public void setIsPlaceHolder(int r1) {
                r0 = this;
                r0.isPlaceHolder = r1
                return
        }

        public void setIsSendBidData(int r1) {
                r0 = this;
                r0.isSendBidData = r1
                return
        }

        public void setLastTime(int r1) {
                r0 = this;
                r0.lastTime = r1
                return
        }

        public void setMinShowTime(int r1) {
                r0 = this;
                r0.minShowTime = r1
                return
        }

        public void setNativeOptimize(com.beizi.fusion.model.AdSpacesBean.NativeOptimizeBean r1) {
                r0 = this;
                r0.nativeOptimize = r1
                return
        }

        public void setNativeRule(com.beizi.fusion.model.AdSpacesBean.NativeRuleBean r1) {
                r0 = this;
                r0.nativeRule = r1
                return
        }

        public void setPriceDict(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.PriceDictBean> r1) {
                r0 = this;
                r0.priceDict = r1
                return
        }

        public void setRegionalClickView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RegionalClickViewBean r1) {
                r0 = this;
                r0.regionalClickView = r1
                return
        }

        public void setRenderAds(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RenderAds r1) {
                r0 = this;
                r0.renderAds = r1
                return
        }

        public void setRenderView(java.util.List<com.beizi.fusion.model.AdSpacesBean.RenderViewBean> r1) {
                r0 = this;
                r0.renderView = r1
                return
        }

        public void setRenderViewSsid(java.lang.String r1) {
                r0 = this;
                r0.renderViewSsid = r1
                return
        }

        public void setReqTimeOutType(int r1) {
                r0 = this;
                r0.reqTimeOutType = r1
                return
        }

        public void setRollView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean r1) {
                r0 = this;
                r0.rollView = r1
                return
        }

        public void setScreenConfigVo(java.util.List<com.beizi.fusion.model.AdSpacesBean.ScreenConfigVoBean> r1) {
                r0 = this;
                r0.screenConfigVo = r1
                return
        }

        public void setScrollClick(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ScrollClickBean r1) {
                r0 = this;
                r0.scrollClick = r1
                return
        }

        public void setShakeView(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r1) {
                r0 = this;
                r0.shakeView = r1
                return
        }

        public void setSizeRatio(int r1) {
                r0 = this;
                r0.sizeRatio = r1
                return
        }

        public void setSpaceId(java.lang.String r1) {
                r0 = this;
                r0.spaceId = r1
                return
        }

        public void setTemplate(int r1) {
                r0 = this;
                r0.template = r1
                return
        }

        public void setWaitTime(int r1) {
                r0 = this;
                r0.waitTime = r1
                return
        }

        public void setZone(java.lang.String r1) {
                r0 = this;
                r0.zone = r1
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "BuyerBean{id='"
                r0.append(r1)
                java.lang.String r1 = r4.id
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", buyerSpaceUuId='"
                r0.append(r2)
                java.lang.String r2 = r4.buyerSpaceUuId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", zone='"
                r0.append(r2)
                java.lang.String r2 = r4.zone
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", appId='"
                r0.append(r2)
                java.lang.String r2 = r4.appId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", spaceId='"
                r0.append(r2)
                java.lang.String r2 = r4.spaceId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", avgPrice="
                r0.append(r2)
                double r2 = r4.avgPrice
                r0.append(r2)
                java.lang.String r2 = ", adWorker='"
                r0.append(r2)
                java.lang.String r2 = r4.adWorker
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", filter="
                r0.append(r2)
                com.beizi.fusion.model.AdSpacesBean$FilterBean r2 = r4.filter
                r0.append(r2)
                java.lang.String r2 = ", reqTimeOutType="
                r0.append(r2)
                int r2 = r4.reqTimeOutType
                r0.append(r2)
                java.lang.String r2 = ", renderView="
                r0.append(r2)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RenderViewBean> r2 = r4.renderView
                r0.append(r2)
                java.lang.String r2 = ", adSize="
                r0.append(r2)
                com.beizi.fusion.model.AdSpacesBean$AdSizeBean r2 = r4.adSize
                r0.append(r2)
                java.lang.String r2 = ", directDownload="
                r0.append(r2)
                int r2 = r4.directDownload
                r0.append(r2)
                java.lang.String r2 = ", renderViewSsid='"
                r0.append(r2)
                java.lang.String r2 = r4.renderViewSsid
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", filterSsid='"
                r0.append(r2)
                java.lang.String r2 = r4.filterSsid
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", bidType='"
                r0.append(r2)
                java.lang.String r2 = r4.bidType
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", cache='"
                r0.append(r2)
                int r2 = r4.cache
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CallBackStrategyBean {

        @com.beizi.fusion.model.JsonNode(key = "count")
        private java.lang.String count;

        @com.beizi.fusion.model.JsonNode(key = "eventCode")
        private java.lang.String eventCode;

        @com.beizi.fusion.model.JsonNode(key = "interval")
        private java.lang.String interval;

        @com.beizi.fusion.model.JsonNode(key = "rate")
        private java.lang.String rate;

        public CallBackStrategyBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getCount() {
                r1 = this;
                java.lang.String r0 = r1.count
                return r0
        }

        public java.lang.String getEventCode() {
                r1 = this;
                java.lang.String r0 = r1.eventCode
                return r0
        }

        public java.lang.String getInterval() {
                r1 = this;
                java.lang.String r0 = r1.interval
                return r0
        }

        public java.lang.String getRate() {
                r1 = this;
                java.lang.String r0 = r1.rate
                return r0
        }

        public void setCount(java.lang.String r1) {
                r0 = this;
                r0.count = r1
                return
        }

        public void setEventCode(java.lang.String r1) {
                r0 = this;
                r0.eventCode = r1
                return
        }

        public void setInterval(java.lang.String r1) {
                r0 = this;
                r0.interval = r1
                return
        }

        public void setRate(java.lang.String r1) {
                r0 = this;
                r0.rate = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ComplainBean {

        @com.beizi.fusion.model.JsonNode(key = "duration")
        private long duration;

        @com.beizi.fusion.model.JsonNode(key = "open")
        private int open;

        public ComplainBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public long getDuration() {
                r2 = this;
                long r0 = r2.duration
                return r0
        }

        public int getOpen() {
                r1 = this;
                int r0 = r1.open
                return r0
        }

        public void setDuration(long r1) {
                r0 = this;
                r0.duration = r1
                return
        }

        public void setOpen(int r1) {
                r0 = this;
                r0.open = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ComponentBean {

        @com.beizi.fusion.model.JsonNode(key = "content")
        private java.lang.String content;

        @com.beizi.fusion.model.JsonNode(key = "forward")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> forward;

        public ComponentBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getContent() {
                r1 = this;
                java.lang.String r0 = r1.content
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> getForward() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$ForwardBean> r0 = r1.forward
                return r0
        }

        public void setContent(java.lang.String r1) {
                r0 = this;
                r0.content = r1
                return
        }

        public void setForward(java.util.List<com.beizi.fusion.model.AdSpacesBean.ForwardBean> r1) {
                r0 = this;
                r0.forward = r1
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ComponentBean{content='"
                r0.append(r1)
                java.lang.String r1 = r2.content
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", forward="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$ForwardBean> r1 = r2.forward
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DpLinkUrlListBean {

        @com.beizi.fusion.model.JsonNode(key = "dpLinkUrL")
        private java.lang.String dpLinkUrL;

        @com.beizi.fusion.model.JsonNode(key = "optimizePercent")
        private int optimizePercent;

        public DpLinkUrlListBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$DpLinkUrlListBean> r0 = com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$DpLinkUrlListBean r1 = (com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public java.lang.String getDpLinkUrL() {
                r1 = this;
                java.lang.String r0 = r1.dpLinkUrL
                return r0
        }

        public int getOptimizePercent() {
                r1 = this;
                int r0 = r1.optimizePercent
                return r0
        }

        public void setDpLinkUrL(java.lang.String r1) {
                r0 = this;
                r0.dpLinkUrL = r1
                return
        }

        public void setOptimizePercent(int r1) {
                r0 = this;
                r0.optimizePercent = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DpLinkUrlListBean{dpLinkUrL='"
                r0.append(r1)
                java.lang.String r1 = r2.dpLinkUrL
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", optimizePercent="
                r0.append(r1)
                int r1 = r2.optimizePercent
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class EventStrategyBean {

        @com.beizi.fusion.model.JsonNode(key = "randomStrategy")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.RandomStrategyBean> randomStrategy;

        @com.beizi.fusion.model.JsonNode(key = "validTimeShow")
        private int validTimeShow;

        public EventStrategyBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.RandomStrategyBean> getRandomStrategy() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RandomStrategyBean> r0 = r1.randomStrategy
                return r0
        }

        public int getValidTimeShow() {
                r1 = this;
                int r0 = r1.validTimeShow
                return r0
        }

        public void setRandomStrategy(java.util.List<com.beizi.fusion.model.AdSpacesBean.RandomStrategyBean> r1) {
                r0 = this;
                r0.randomStrategy = r1
                return
        }

        public void setValidTimeShow(int r1) {
                r0 = this;
                r0.validTimeShow = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FilterBean {

        @com.beizi.fusion.model.JsonNode(key = "frequency")
        private java.util.List<com.beizi.fusion.model.FreqItem> frequency;

        @com.beizi.fusion.model.JsonNode(key = "imeiLength")
        private java.util.List<java.lang.Integer> imeiLength;

        @com.beizi.fusion.model.JsonNode(key = "minAdLoadTime")
        private int minAdLoadTime;

        @com.beizi.fusion.model.JsonNode(key = "privilege")
        private java.util.List<java.lang.String> privilege;

        @com.beizi.fusion.model.JsonNode(key = "uniteControl")
        private com.beizi.fusion.model.AdSpacesBean.UniteControlBean uniteControl;

        public FilterBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.FilterBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$FilterBean> r0 = com.beizi.fusion.model.AdSpacesBean.FilterBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$FilterBean r1 = (com.beizi.fusion.model.AdSpacesBean.FilterBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public java.util.List<com.beizi.fusion.model.FreqItem> getFrequency() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.FreqItem> r0 = r1.frequency
                return r0
        }

        public java.util.List<java.lang.Integer> getImeiLength() {
                r1 = this;
                java.util.List<java.lang.Integer> r0 = r1.imeiLength
                return r0
        }

        public int getMinAdLoadTime() {
                r1 = this;
                int r0 = r1.minAdLoadTime
                return r0
        }

        public java.util.List<java.lang.String> getPrivilege() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.privilege
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.UniteControlBean getUniteControl() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$UniteControlBean r0 = r1.uniteControl
                return r0
        }

        public void setFrequency(java.util.List<com.beizi.fusion.model.FreqItem> r1) {
                r0 = this;
                r0.frequency = r1
                return
        }

        public void setImeiLength(java.util.List<java.lang.Integer> r1) {
                r0 = this;
                r0.imeiLength = r1
                return
        }

        public void setMinAdLoadTime(int r1) {
                r0 = this;
                r0.minAdLoadTime = r1
                return
        }

        public void setPrivilege(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.privilege = r1
                return
        }

        public void setUniteControl(com.beizi.fusion.model.AdSpacesBean.UniteControlBean r1) {
                r0 = this;
                r0.uniteControl = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FilterBean{minAdLoadTime="
                r0.append(r1)
                int r1 = r2.minAdLoadTime
                r0.append(r1)
                java.lang.String r1 = ", privilege="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r2.privilege
                r0.append(r1)
                java.lang.String r1 = ", imeiLength="
                r0.append(r1)
                java.util.List<java.lang.Integer> r1 = r2.imeiLength
                r0.append(r1)
                java.lang.String r1 = ", frequency="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.FreqItem> r1 = r2.frequency
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ForwardBean implements java.lang.Cloneable {

        @com.beizi.fusion.model.JsonNode(key = "baseId")
        private java.lang.String baseId;

        @com.beizi.fusion.model.JsonNode(key = "buyerId")
        private java.lang.String buyerId;

        @com.beizi.fusion.model.JsonNode(key = "buyerSpaceUuId")
        private java.lang.String buyerSpaceUuId;

        @com.beizi.fusion.model.JsonNode(key = "component")
        private com.beizi.fusion.model.AdSpacesBean.ComponentBean component;

        @com.beizi.fusion.model.JsonNode(key = "forwardId")
        private java.lang.String forwardId;

        @com.beizi.fusion.model.JsonNode(key = "hotRequestDelay")
        private long hotRequestDelay;

        @com.beizi.fusion.model.JsonNode(key = "level")
        private java.lang.String level;

        @com.beizi.fusion.model.JsonNode(key = "parentForwardId")
        private java.lang.String parentForwardId;

        @com.beizi.fusion.model.JsonNode(key = "rules")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> rules;

        @com.beizi.fusion.model.JsonNode(key = "sleepTime")
        private long sleepTime;

        public ForwardBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.ForwardBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$ForwardBean> r0 = com.beizi.fusion.model.AdSpacesBean.ForwardBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$ForwardBean r1 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                java.lang.Object r0 = super.clone()
                return r0
        }

        public java.lang.String getBaseId() {
                r1 = this;
                java.lang.String r0 = r1.baseId
                return r0
        }

        public java.lang.String getBuyerId() {
                r1 = this;
                java.lang.String r0 = r1.buyerId
                return r0
        }

        public java.lang.String getBuyerSpaceUuId() {
                r1 = this;
                java.lang.String r0 = r1.buyerSpaceUuId
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.ComponentBean getComponent() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$ComponentBean r0 = r1.component
                return r0
        }

        public java.lang.String getForwardId() {
                r1 = this;
                java.lang.String r0 = r1.forwardId
                return r0
        }

        public long getHotRequestDelay() {
                r2 = this;
                long r0 = r2.hotRequestDelay
                return r0
        }

        public java.lang.String getLevel() {
                r1 = this;
                java.lang.String r0 = r1.level
                return r0
        }

        public java.lang.String getParentForwardId() {
                r1 = this;
                java.lang.String r0 = r1.parentForwardId
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> getRules() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r0 = r1.rules
                return r0
        }

        public long getSleepTime() {
                r2 = this;
                long r0 = r2.sleepTime
                return r0
        }

        public void setBaseId(java.lang.String r1) {
                r0 = this;
                r0.baseId = r1
                return
        }

        public void setBuyerId(java.lang.String r1) {
                r0 = this;
                r0.buyerId = r1
                return
        }

        public void setBuyerSpaceUuId(java.lang.String r1) {
                r0 = this;
                r0.buyerSpaceUuId = r1
                return
        }

        public void setComponent(com.beizi.fusion.model.AdSpacesBean.ComponentBean r1) {
                r0 = this;
                r0.component = r1
                return
        }

        public void setForwardId(java.lang.String r1) {
                r0 = this;
                r0.forwardId = r1
                return
        }

        public void setHotRequestDelay(long r1) {
                r0 = this;
                r0.hotRequestDelay = r1
                return
        }

        public void setLevel(java.lang.String r1) {
                r0 = this;
                r0.level = r1
                return
        }

        public void setParentForwardId(java.lang.String r1) {
                r0 = this;
                r0.parentForwardId = r1
                return
        }

        public void setRules(java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> r1) {
                r0 = this;
                r0.rules = r1
                return
        }

        public void setSleepTime(long r1) {
                r0 = this;
                r0.sleepTime = r1
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ForwardBean{buyerId='"
                r0.append(r1)
                java.lang.String r1 = r4.buyerId
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", baseId='"
                r0.append(r2)
                java.lang.String r2 = r4.baseId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", sleepTime="
                r0.append(r2)
                long r2 = r4.sleepTime
                r0.append(r2)
                java.lang.String r2 = ", hotRequestDelay="
                r0.append(r2)
                long r2 = r4.hotRequestDelay
                r0.append(r2)
                java.lang.String r2 = ", forwardId='"
                r0.append(r2)
                java.lang.String r2 = r4.forwardId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", parentForwardId='"
                r0.append(r2)
                java.lang.String r2 = r4.parentForwardId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", level='"
                r0.append(r2)
                java.lang.String r2 = r4.level
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", buyerSpaceUuId='"
                r0.append(r2)
                java.lang.String r2 = r4.buyerSpaceUuId
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", component="
                r0.append(r1)
                com.beizi.fusion.model.AdSpacesBean$ComponentBean r1 = r4.component
                r0.append(r1)
                java.lang.String r1 = ", rules="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r1 = r4.rules
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeOptimizeAdSlideBean {

        @com.beizi.fusion.model.JsonNode(key = "distance")
        private int distance;

        @com.beizi.fusion.model.JsonNode(key = "isTouchUp")
        private int isTouchUp;

        @com.beizi.fusion.model.JsonNode(key = "needTime")
        private int needTime;

        @com.beizi.fusion.model.JsonNode(key = "randomNum")
        private int randomNum;

        public NativeOptimizeAdSlideBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getDistance() {
                r1 = this;
                int r0 = r1.distance
                return r0
        }

        public int getIsTouchUp() {
                r1 = this;
                int r0 = r1.isTouchUp
                return r0
        }

        public int getNeedTime() {
                r1 = this;
                int r0 = r1.needTime
                return r0
        }

        public int getRandomNum() {
                r1 = this;
                int r0 = r1.randomNum
                return r0
        }

        public void setDistance(int r1) {
                r0 = this;
                r0.distance = r1
                return
        }

        public void setIsTouchUp(int r1) {
                r0 = this;
                r0.isTouchUp = r1
                return
        }

        public void setNeedTime(int r1) {
                r0 = this;
                r0.needTime = r1
                return
        }

        public void setRandomNum(int r1) {
                r0 = this;
                r0.randomNum = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeOptimizeBean {

        @com.beizi.fusion.model.JsonNode(key = "adSlide")
        private com.beizi.fusion.model.AdSpacesBean.NativeOptimizeAdSlideBean adSlide;

        @com.beizi.fusion.model.JsonNode(key = "addClickNum")
        private int addClickNum;

        @com.beizi.fusion.model.JsonNode(key = "clickArea")
        private com.beizi.fusion.model.AdSpacesBean.NativeOptimizeClickAreaBean clickArea;

        @com.beizi.fusion.model.JsonNode(key = "closeClickNum")
        private int closeClickNum;

        @com.beizi.fusion.model.JsonNode(key = "holdSlideNum")
        private int holdSlideNum;

        @com.beizi.fusion.model.JsonNode(key = "nativeUuid")
        private java.lang.String nativeUuid;

        @com.beizi.fusion.model.JsonNode(key = "touchDownNum")
        private int touchDownNum;

        public NativeOptimizeBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.beizi.fusion.model.AdSpacesBean.NativeOptimizeAdSlideBean getAdSlide() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$NativeOptimizeAdSlideBean r0 = r1.adSlide
                return r0
        }

        public int getAddClickNum() {
                r1 = this;
                int r0 = r1.addClickNum
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.NativeOptimizeClickAreaBean getClickArea() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$NativeOptimizeClickAreaBean r0 = r1.clickArea
                return r0
        }

        public int getCloseClickNum() {
                r1 = this;
                int r0 = r1.closeClickNum
                return r0
        }

        public int getHoldSlideNum() {
                r1 = this;
                int r0 = r1.holdSlideNum
                return r0
        }

        public java.lang.String getNativeUuid() {
                r1 = this;
                java.lang.String r0 = r1.nativeUuid
                return r0
        }

        public int getTouchDownNum() {
                r1 = this;
                int r0 = r1.touchDownNum
                return r0
        }

        public void setAdSlide(com.beizi.fusion.model.AdSpacesBean.NativeOptimizeAdSlideBean r1) {
                r0 = this;
                r0.adSlide = r1
                return
        }

        public void setAddClickNum(int r1) {
                r0 = this;
                r0.addClickNum = r1
                return
        }

        public void setClickArea(com.beizi.fusion.model.AdSpacesBean.NativeOptimizeClickAreaBean r1) {
                r0 = this;
                r0.clickArea = r1
                return
        }

        public void setCloseClickNum(int r1) {
                r0 = this;
                r0.closeClickNum = r1
                return
        }

        public void setHoldSlideNum(int r1) {
                r0 = this;
                r0.holdSlideNum = r1
                return
        }

        public void setNativeUuid(java.lang.String r1) {
                r0 = this;
                r0.nativeUuid = r1
                return
        }

        public void setTouchDownNum(int r1) {
                r0 = this;
                r0.touchDownNum = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeOptimizeClickAreaBean {

        @com.beizi.fusion.model.JsonNode(key = "height")
        private java.lang.String height;

        @com.beizi.fusion.model.JsonNode(key = "horizontalSpace")
        private java.lang.String horizontalSpace;

        @com.beizi.fusion.model.JsonNode(key = "randomNum")
        private int randomNum;

        @com.beizi.fusion.model.JsonNode(key = "reference")
        private int reference;

        @com.beizi.fusion.model.JsonNode(key = "verticalSpace")
        private java.lang.String verticalSpace;

        @com.beizi.fusion.model.JsonNode(key = "width")
        private java.lang.String width;

        public NativeOptimizeClickAreaBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getHeight() {
                r1 = this;
                java.lang.String r0 = r1.height
                return r0
        }

        public java.lang.String getHorizontalSpace() {
                r1 = this;
                java.lang.String r0 = r1.horizontalSpace
                return r0
        }

        public int getRandomNum() {
                r1 = this;
                int r0 = r1.randomNum
                return r0
        }

        public int getReference() {
                r1 = this;
                int r0 = r1.reference
                return r0
        }

        public java.lang.String getVerticalSpace() {
                r1 = this;
                java.lang.String r0 = r1.verticalSpace
                return r0
        }

        public java.lang.String getWidth() {
                r1 = this;
                java.lang.String r0 = r1.width
                return r0
        }

        public void setHeight(java.lang.String r1) {
                r0 = this;
                r0.height = r1
                return
        }

        public void setHorizontalSpace(java.lang.String r1) {
                r0 = this;
                r0.horizontalSpace = r1
                return
        }

        public void setRandomNum(int r1) {
                r0 = this;
                r0.randomNum = r1
                return
        }

        public void setReference(int r1) {
                r0 = this;
                r0.reference = r1
                return
        }

        public void setVerticalSpace(java.lang.String r1) {
                r0 = this;
                r0.verticalSpace = r1
                return
        }

        public void setWidth(java.lang.String r1) {
                r0 = this;
                r0.width = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NativeRuleBean {

        @com.beizi.fusion.model.JsonNode(key = "nativeRuleUuid")
        private java.lang.String nativeRuleUuid;

        @com.beizi.fusion.model.JsonNode(key = "needNum")
        private int needNum;

        @com.beizi.fusion.model.JsonNode(key = "needTime")
        private int needTime;

        public NativeRuleBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getNativeRuleUuid() {
                r1 = this;
                java.lang.String r0 = r1.nativeRuleUuid
                return r0
        }

        public int getNeedNum() {
                r1 = this;
                int r0 = r1.needNum
                return r0
        }

        public int getNeedTime() {
                r1 = this;
                int r0 = r1.needTime
                return r0
        }

        public void setNativeRuleUuid(java.lang.String r1) {
                r0 = this;
                r0.nativeRuleUuid = r1
                return
        }

        public void setNeedNum(int r1) {
                r0 = this;
                r0.needNum = r1
                return
        }

        public void setNeedTime(int r1) {
                r0 = this;
                r0.needTime = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PassPolicyBean {

        @com.beizi.fusion.model.JsonNode(key = "passPercent")
        private int passPercent;

        @com.beizi.fusion.model.JsonNode(key = "passType")
        private java.lang.String passType;

        public PassPolicyBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.PassPolicyBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$PassPolicyBean> r0 = com.beizi.fusion.model.AdSpacesBean.PassPolicyBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$PassPolicyBean r1 = (com.beizi.fusion.model.AdSpacesBean.PassPolicyBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public int getPassPercent() {
                r1 = this;
                int r0 = r1.passPercent
                return r0
        }

        public java.lang.String getPassType() {
                r1 = this;
                java.lang.String r0 = r1.passType
                return r0
        }

        public void setPassPercent(int r1) {
                r0 = this;
                r0.passPercent = r1
                return
        }

        public void setPassType(java.lang.String r1) {
                r0 = this;
                r0.passType = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "passPolicyBean{passType='"
                r0.append(r1)
                java.lang.String r1 = r2.passType
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", passPercent="
                r0.append(r1)
                int r1 = r2.passPercent
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PositionBean {

        @com.beizi.fusion.model.JsonNode(key = "centerX")
        private double centerX;

        @com.beizi.fusion.model.JsonNode(key = "centerY")
        private double centerY;

        @com.beizi.fusion.model.JsonNode(key = "height")
        private double height;

        @com.beizi.fusion.model.JsonNode(key = "width")
        private double width;

        public PositionBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.PositionBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$PositionBean> r0 = com.beizi.fusion.model.AdSpacesBean.PositionBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$PositionBean r1 = (com.beizi.fusion.model.AdSpacesBean.PositionBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public double getCenterX() {
                r2 = this;
                double r0 = r2.centerX
                return r0
        }

        public double getCenterY() {
                r2 = this;
                double r0 = r2.centerY
                return r0
        }

        public double getHeight() {
                r2 = this;
                double r0 = r2.height
                return r0
        }

        public double getWidth() {
                r2 = this;
                double r0 = r2.width
                return r0
        }

        public void setCenterX(double r1) {
                r0 = this;
                r0.centerX = r1
                return
        }

        public void setCenterY(double r1) {
                r0 = this;
                r0.centerY = r1
                return
        }

        public void setHeight(double r1) {
                r0 = this;
                r0.height = r1
                return
        }

        public void setWidth(double r1) {
                r0 = this;
                r0.width = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PositionBean{centerX="
                r0.append(r1)
                double r1 = r3.centerX
                r0.append(r1)
                java.lang.String r1 = ", centerY="
                r0.append(r1)
                double r1 = r3.centerY
                r0.append(r1)
                java.lang.String r1 = ", width="
                r0.append(r1)
                double r1 = r3.width
                r0.append(r1)
                java.lang.String r1 = ", height="
                r0.append(r1)
                double r1 = r3.height
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RandomStrategyBean {

        @com.beizi.fusion.model.JsonNode(key = "action")
        private int action;

        @com.beizi.fusion.model.JsonNode(key = "eventType")
        private java.lang.String eventType;

        @com.beizi.fusion.model.JsonNode(key = "max")
        private int max;

        @com.beizi.fusion.model.JsonNode(key = "min")
        private int min;

        public RandomStrategyBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getAction() {
                r1 = this;
                int r0 = r1.action
                return r0
        }

        public java.lang.String getEventType() {
                r1 = this;
                java.lang.String r0 = r1.eventType
                return r0
        }

        public int getMax() {
                r1 = this;
                int r0 = r1.max
                return r0
        }

        public int getMin() {
                r1 = this;
                int r0 = r1.min
                return r0
        }

        public void setAction(int r1) {
                r0 = this;
                r0.action = r1
                return
        }

        public void setEventType(java.lang.String r1) {
                r0 = this;
                r0.eventType = r1
                return
        }

        public void setMax(int r1) {
                r0 = this;
                r0.max = r1
                return
        }

        public void setMin(int r1) {
                r0 = this;
                r0.min = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RenderViewBean {

        @com.beizi.fusion.model.JsonNode(key = "borderHeight")
        private java.lang.String borderHeight;

        @com.beizi.fusion.model.JsonNode(key = "borderWidth")
        private java.lang.String borderWidth;

        @com.beizi.fusion.model.JsonNode(key = "clickNum")
        private int clickNum;

        @com.beizi.fusion.model.JsonNode(key = "countDownColor")
        private java.lang.String countDownColor;

        @com.beizi.fusion.model.JsonNode(key = "delayDisplaySkipButton")
        private long delayDisplaySkipButton;

        @com.beizi.fusion.model.JsonNode(key = "direction")
        private java.lang.String direction;

        @com.beizi.fusion.model.JsonNode(key = "dpLinkUrlList")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean> dpLinkUrlList;

        @com.beizi.fusion.model.JsonNode(key = "imageUrl")
        private java.lang.String imageUrl;

        @com.beizi.fusion.model.JsonNode(key = "layerPosition")
        private com.beizi.fusion.model.AdSpacesBean.PositionBean layerPosition;

        @com.beizi.fusion.model.JsonNode(key = "level")
        private int level;

        @com.beizi.fusion.model.JsonNode(key = "location")
        private java.lang.String location;

        @com.beizi.fusion.model.JsonNode(key = "optimizePercent")
        private int optimizePercent;

        @com.beizi.fusion.model.JsonNode(key = "optimizeSize")
        private int optimizeSize;

        @com.beizi.fusion.model.JsonNode(key = "paddingHeight")
        private double paddingHeight;

        @com.beizi.fusion.model.JsonNode(key = "passPolicy")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.PassPolicyBean> passPolicy;

        @com.beizi.fusion.model.JsonNode(key = "picSkipTime")
        private int picSkipTime;

        @com.beizi.fusion.model.JsonNode(key = "scrollDistance")
        private java.lang.String scrollDistance;

        @com.beizi.fusion.model.JsonNode(key = "scrollDistancePercent")
        private int scrollDistancePercent;

        @com.beizi.fusion.model.JsonNode(key = "showBorder")
        private int showBorder;

        @com.beizi.fusion.model.JsonNode(key = "showCountDown")
        private int showCountDown;

        @com.beizi.fusion.model.JsonNode(key = "size")
        private java.lang.String size;

        @com.beizi.fusion.model.JsonNode(key = "skipText")
        private java.lang.String skipText;

        @com.beizi.fusion.model.JsonNode(key = "skipUnavailableTime")
        private long skipUnavailableTime;

        @com.beizi.fusion.model.JsonNode(key = "skipViewTotalTime")
        private long skipViewTotalTime;

        @com.beizi.fusion.model.JsonNode(key = "tapPosition")
        private com.beizi.fusion.model.AdSpacesBean.PositionBean tapPosition;

        @com.beizi.fusion.model.JsonNode(key = "textColor")
        private java.lang.String textColor;

        @com.beizi.fusion.model.JsonNode(key = "type")
        private java.lang.String type;

        @com.beizi.fusion.model.JsonNode(key = "videoSkipTime")
        private int videoSkipTime;

        public RenderViewBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.beizi.fusion.model.AdSpacesBean.RenderViewBean objectFromData(java.lang.String r1) {
                java.lang.Class<com.beizi.fusion.model.AdSpacesBean$RenderViewBean> r0 = com.beizi.fusion.model.AdSpacesBean.RenderViewBean.class
                java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
                com.beizi.fusion.model.AdSpacesBean$RenderViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.RenderViewBean) r1     // Catch: java.lang.Exception -> L9
                return r1
            L9:
                r1 = 0
                return r1
        }

        public java.lang.String getBorderHeight() {
                r1 = this;
                java.lang.String r0 = r1.borderHeight
                return r0
        }

        public java.lang.String getBorderWidth() {
                r1 = this;
                java.lang.String r0 = r1.borderWidth
                return r0
        }

        public int getClickNum() {
                r1 = this;
                int r0 = r1.clickNum
                return r0
        }

        public java.lang.String getCountDownColor() {
                r1 = this;
                java.lang.String r0 = r1.countDownColor
                return r0
        }

        public long getDelayDisplaySkipButton() {
                r2 = this;
                long r0 = r2.delayDisplaySkipButton
                return r0
        }

        public java.lang.String getDirection() {
                r1 = this;
                java.lang.String r0 = r1.direction
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean> getDpLinkUrlList() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$DpLinkUrlListBean> r0 = r1.dpLinkUrlList
                return r0
        }

        public java.lang.String getImageUrl() {
                r1 = this;
                java.lang.String r0 = r1.imageUrl
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.PositionBean getLayerPosition() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$PositionBean r0 = r1.layerPosition
                return r0
        }

        public int getLevel() {
                r1 = this;
                int r0 = r1.level
                return r0
        }

        public java.lang.String getLocation() {
                r1 = this;
                java.lang.String r0 = r1.location
                return r0
        }

        public int getOptimizePercent() {
                r1 = this;
                int r0 = r1.optimizePercent
                return r0
        }

        public int getOptimizeSize() {
                r1 = this;
                int r0 = r1.optimizeSize
                return r0
        }

        public double getPaddingHeight() {
                r2 = this;
                double r0 = r2.paddingHeight
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.PassPolicyBean> getPassPolicy() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$PassPolicyBean> r0 = r1.passPolicy
                return r0
        }

        public int getPicSkipTime() {
                r1 = this;
                int r0 = r1.picSkipTime
                return r0
        }

        public java.lang.String getScrollDistance() {
                r1 = this;
                java.lang.String r0 = r1.scrollDistance
                return r0
        }

        public int getScrollDistancePercent() {
                r1 = this;
                int r0 = r1.scrollDistancePercent
                return r0
        }

        public int getShowBorder() {
                r1 = this;
                int r0 = r1.showBorder
                return r0
        }

        public int getShowCountDown() {
                r1 = this;
                int r0 = r1.showCountDown
                return r0
        }

        public java.lang.String getSize() {
                r1 = this;
                java.lang.String r0 = r1.size
                return r0
        }

        public java.lang.String getSkipText() {
                r1 = this;
                java.lang.String r0 = r1.skipText
                return r0
        }

        public long getSkipUnavailableTime() {
                r2 = this;
                long r0 = r2.skipUnavailableTime
                return r0
        }

        public long getSkipViewTotalTime() {
                r2 = this;
                long r0 = r2.skipViewTotalTime
                return r0
        }

        public com.beizi.fusion.model.AdSpacesBean.PositionBean getTapPosition() {
                r1 = this;
                com.beizi.fusion.model.AdSpacesBean$PositionBean r0 = r1.tapPosition
                return r0
        }

        public java.lang.String getTextColor() {
                r1 = this;
                java.lang.String r0 = r1.textColor
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }

        public int getVideoSkipTime() {
                r1 = this;
                int r0 = r1.videoSkipTime
                return r0
        }

        public void setBorderHeight(java.lang.String r1) {
                r0 = this;
                r0.borderHeight = r1
                return
        }

        public void setBorderWidth(java.lang.String r1) {
                r0 = this;
                r0.borderWidth = r1
                return
        }

        public void setClickNum(int r1) {
                r0 = this;
                r0.clickNum = r1
                return
        }

        public void setCountDownColor(java.lang.String r1) {
                r0 = this;
                r0.countDownColor = r1
                return
        }

        public void setDelayDisplaySkipButton(long r1) {
                r0 = this;
                r0.delayDisplaySkipButton = r1
                return
        }

        public void setDirection(java.lang.String r1) {
                r0 = this;
                r0.direction = r1
                return
        }

        public void setDpLinkUrlList(java.util.List<com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean> r1) {
                r0 = this;
                r0.dpLinkUrlList = r1
                return
        }

        public void setImageUrl(java.lang.String r1) {
                r0 = this;
                r0.imageUrl = r1
                return
        }

        public void setLayerPosition(com.beizi.fusion.model.AdSpacesBean.PositionBean r1) {
                r0 = this;
                r0.layerPosition = r1
                return
        }

        public void setLevel(int r1) {
                r0 = this;
                r0.level = r1
                return
        }

        public void setLocation(java.lang.String r1) {
                r0 = this;
                r0.location = r1
                return
        }

        public void setOptimizePercent(int r1) {
                r0 = this;
                r0.optimizePercent = r1
                return
        }

        public void setOptimizeSize(int r1) {
                r0 = this;
                r0.optimizeSize = r1
                return
        }

        public void setPaddingHeight(double r1) {
                r0 = this;
                r0.paddingHeight = r1
                return
        }

        public void setPassPolicy(java.util.List<com.beizi.fusion.model.AdSpacesBean.PassPolicyBean> r1) {
                r0 = this;
                r0.passPolicy = r1
                return
        }

        public void setPicSkipTime(int r1) {
                r0 = this;
                r0.picSkipTime = r1
                return
        }

        public void setScrollDistance(java.lang.String r1) {
                r0 = this;
                r0.scrollDistance = r1
                return
        }

        public void setScrollDistancePercent(int r1) {
                r0 = this;
                r0.scrollDistancePercent = r1
                return
        }

        public void setShowBorder(int r1) {
                r0 = this;
                r0.showBorder = r1
                return
        }

        public void setShowCountDown(int r1) {
                r0 = this;
                r0.showCountDown = r1
                return
        }

        public void setSize(java.lang.String r1) {
                r0 = this;
                r0.size = r1
                return
        }

        public void setSkipText(java.lang.String r1) {
                r0 = this;
                r0.skipText = r1
                return
        }

        public void setSkipUnavailableTime(long r1) {
                r0 = this;
                r0.skipUnavailableTime = r1
                return
        }

        public void setSkipViewTotalTime(long r1) {
                r0 = this;
                r0.skipViewTotalTime = r1
                return
        }

        public void setTapPosition(com.beizi.fusion.model.AdSpacesBean.PositionBean r1) {
                r0 = this;
                r0.tapPosition = r1
                return
        }

        public void setTextColor(java.lang.String r1) {
                r0 = this;
                r0.textColor = r1
                return
        }

        public void setType(java.lang.String r1) {
                r0 = this;
                r0.type = r1
                return
        }

        public void setVideoSkipTime(int r1) {
                r0 = this;
                r0.videoSkipTime = r1
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RenderViewBean{type='"
                r0.append(r1)
                java.lang.String r1 = r4.type
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", dpLinkUrlList="
                r0.append(r2)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$DpLinkUrlListBean> r2 = r4.dpLinkUrlList
                r0.append(r2)
                java.lang.String r2 = ", optimizePercent="
                r0.append(r2)
                int r2 = r4.optimizePercent
                r0.append(r2)
                java.lang.String r2 = ", optimizeSize="
                r0.append(r2)
                int r2 = r4.optimizeSize
                r0.append(r2)
                java.lang.String r2 = ", scrollDistance='"
                r0.append(r2)
                java.lang.String r2 = r4.scrollDistance
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", scrollDistancePercent="
                r0.append(r2)
                int r2 = r4.scrollDistancePercent
                r0.append(r2)
                java.lang.String r2 = ", direction='"
                r0.append(r2)
                java.lang.String r2 = r4.direction
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", level="
                r0.append(r2)
                int r2 = r4.level
                r0.append(r2)
                java.lang.String r2 = ", skipUnavailableTime="
                r0.append(r2)
                long r2 = r4.skipUnavailableTime
                r0.append(r2)
                java.lang.String r2 = ", skipViewTotalTime="
                r0.append(r2)
                long r2 = r4.skipViewTotalTime
                r0.append(r2)
                java.lang.String r2 = ", layerPosition="
                r0.append(r2)
                com.beizi.fusion.model.AdSpacesBean$PositionBean r2 = r4.layerPosition
                r0.append(r2)
                java.lang.String r2 = ", tapPosition="
                r0.append(r2)
                com.beizi.fusion.model.AdSpacesBean$PositionBean r2 = r4.tapPosition
                r0.append(r2)
                java.lang.String r2 = ", imageUrl='"
                r0.append(r2)
                java.lang.String r2 = r4.imageUrl
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", passPolicy="
                r0.append(r2)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$PassPolicyBean> r2 = r4.passPolicy
                r0.append(r2)
                java.lang.String r2 = ", delayDisplaySkipButton="
                r0.append(r2)
                long r2 = r4.delayDisplaySkipButton
                r0.append(r2)
                java.lang.String r2 = ", paddingHeight="
                r0.append(r2)
                double r2 = r4.paddingHeight
                r0.append(r2)
                java.lang.String r2 = ", skipText='"
                r0.append(r2)
                java.lang.String r2 = r4.skipText
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", textColor='"
                r0.append(r2)
                java.lang.String r2 = r4.textColor
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", showCountDown="
                r0.append(r2)
                int r2 = r4.showCountDown
                r0.append(r2)
                java.lang.String r2 = ", countDownColor='"
                r0.append(r2)
                java.lang.String r2 = r4.countDownColor
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", showBorder="
                r0.append(r1)
                int r1 = r4.showBorder
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RulesBean {

        @com.beizi.fusion.model.JsonNode(key = "baseId")
        private java.lang.String baseId;

        @com.beizi.fusion.model.JsonNode(key = "formula")
        private java.lang.String formula;

        @com.beizi.fusion.model.JsonNode(key = "results")
        private java.lang.Integer[] results;

        @com.beizi.fusion.model.JsonNode(key = "rules")
        private java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> rules;

        public RulesBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getBaseId() {
                r1 = this;
                java.lang.String r0 = r1.baseId
                return r0
        }

        public java.lang.String getFormula() {
                r1 = this;
                java.lang.String r0 = r1.formula
                return r0
        }

        public java.lang.Integer[] getResults() {
                r1 = this;
                java.lang.Integer[] r0 = r1.results
                return r0
        }

        public java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> getRules() {
                r1 = this;
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r0 = r1.rules
                return r0
        }

        public void setBaseId(java.lang.String r1) {
                r0 = this;
                r0.baseId = r1
                return
        }

        public void setFormula(java.lang.String r1) {
                r0 = this;
                r0.formula = r1
                return
        }

        public void setResults(java.lang.Integer[] r1) {
                r0 = this;
                r0.results = r1
                return
        }

        public void setRules(java.util.List<com.beizi.fusion.model.AdSpacesBean.RulesBean> r1) {
                r0 = this;
                r0.rules = r1
                return
        }

        @androidx.annotation.NonNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "RulesBean{formula='"
                r0.append(r1)
                java.lang.String r1 = r2.formula
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", results="
                r0.append(r1)
                java.lang.Integer[] r1 = r2.results
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = ", rules="
                r0.append(r1)
                java.util.List<com.beizi.fusion.model.AdSpacesBean$RulesBean> r1 = r2.rules
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ScreenConfigVoBean {

        @com.beizi.fusion.model.JsonNode(key = "screenH")
        private java.lang.String screenH;

        @com.beizi.fusion.model.JsonNode(key = "screenImage")
        private java.lang.String screenImage;

        @com.beizi.fusion.model.JsonNode(key = "screenPriority")
        private java.lang.String screenPriority;

        @com.beizi.fusion.model.JsonNode(key = "screenW")
        private java.lang.String screenW;

        @com.beizi.fusion.model.JsonNode(key = "screenX")
        private java.lang.String screenX;

        @com.beizi.fusion.model.JsonNode(key = "screenY")
        private java.lang.String screenY;

        public ScreenConfigVoBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getScreenH() {
                r1 = this;
                java.lang.String r0 = r1.screenH
                return r0
        }

        public java.lang.String getScreenImage() {
                r1 = this;
                java.lang.String r0 = r1.screenImage
                return r0
        }

        public java.lang.String getScreenPriority() {
                r1 = this;
                java.lang.String r0 = r1.screenPriority
                return r0
        }

        public java.lang.String getScreenW() {
                r1 = this;
                java.lang.String r0 = r1.screenW
                return r0
        }

        public java.lang.String getScreenX() {
                r1 = this;
                java.lang.String r0 = r1.screenX
                return r0
        }

        public java.lang.String getScreenY() {
                r1 = this;
                java.lang.String r0 = r1.screenY
                return r0
        }

        public void setScreenH(java.lang.String r1) {
                r0 = this;
                r0.screenH = r1
                return
        }

        public void setScreenImage(java.lang.String r1) {
                r0 = this;
                r0.screenImage = r1
                return
        }

        public void setScreenPriority(java.lang.String r1) {
                r0 = this;
                r0.screenPriority = r1
                return
        }

        public void setScreenW(java.lang.String r1) {
                r0 = this;
                r0.screenW = r1
                return
        }

        public void setScreenX(java.lang.String r1) {
                r0 = this;
                r0.screenX = r1
                return
        }

        public void setScreenY(java.lang.String r1) {
                r0 = this;
                r0.screenY = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class UniteControlBean {

        @com.beizi.fusion.model.JsonNode(key = "duration")
        private long duration;

        @com.beizi.fusion.model.JsonNode(key = "random")
        private int random;

        public UniteControlBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public long getDuration() {
                r2 = this;
                long r0 = r2.duration
                return r0
        }

        public int getRandom() {
                r1 = this;
                int r0 = r1.random
                return r0
        }

        public void setDuration(long r1) {
                r0 = this;
                r0.duration = r1
                return
        }

        public void setRandom(int r1) {
                r0 = this;
                r0.random = r1
                return
        }
    }

    public AdSpacesBean() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.beizi.fusion.model.AdSpacesBean objectFromData(java.lang.String r1) {
            java.lang.Class<com.beizi.fusion.model.AdSpacesBean> r0 = com.beizi.fusion.model.AdSpacesBean.class
            java.lang.Object r1 = com.beizi.fusion.model.JsonResolver.fromJson(r1, r0)     // Catch: java.lang.Exception -> L9
            com.beizi.fusion.model.AdSpacesBean r1 = (com.beizi.fusion.model.AdSpacesBean) r1     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            r1 = 0
            return r1
    }

    public java.lang.String getAdType() {
            r1 = this;
            java.lang.String r0 = r1.adType
            return r0
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.appId
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.BidBean getBid() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BidBean r0 = r1.bid
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.BidComponent getBidComponent() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$BidComponent r0 = r1.bidComponent
            return r0
    }

    public java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> getBuyer() {
            r1 = this;
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r0 = r1.buyer
            return r0
    }

    public java.lang.String getBzComponentSsid() {
            r1 = this;
            java.lang.String r0 = r1.bzComponentSsid
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.ComponentBean getComponent() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r0 = r1.component
            return r0
    }

    public java.lang.String getComponentSsid() {
            r1 = this;
            java.lang.String r0 = r1.componentSsid
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.EventStrategyBean getEventStrategy() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$EventStrategyBean r0 = r1.eventStrategy
            return r0
    }

    public com.beizi.fusion.model.AdSpacesBean.FilterBean getFilter() {
            r1 = this;
            com.beizi.fusion.model.AdSpacesBean$FilterBean r0 = r1.filter
            return r0
    }

    public java.lang.String getFilterSsid() {
            r1 = this;
            java.lang.String r0 = r1.filterSsid
            return r0
    }

    public int getModelType() {
            r1 = this;
            int r0 = r1.modelType
            return r0
    }

    public java.lang.String getSpaceId() {
            r1 = this;
            java.lang.String r0 = r1.spaceId
            return r0
    }

    public void setAdType(java.lang.String r1) {
            r0 = this;
            r0.adType = r1
            return
    }

    public void setAppId(java.lang.String r1) {
            r0 = this;
            r0.appId = r1
            return
    }

    public void setBid(com.beizi.fusion.model.AdSpacesBean.BidBean r1) {
            r0 = this;
            r0.bid = r1
            return
    }

    public void setBidComponent(com.beizi.fusion.model.AdSpacesBean.BidComponent r1) {
            r0 = this;
            r0.bidComponent = r1
            return
    }

    public void setBuyer(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean> r1) {
            r0 = this;
            r0.buyer = r1
            return
    }

    public void setBzComponentSsid(java.lang.String r1) {
            r0 = this;
            r0.bzComponentSsid = r1
            return
    }

    public void setComponent(com.beizi.fusion.model.AdSpacesBean.ComponentBean r1) {
            r0 = this;
            r0.component = r1
            return
    }

    public void setComponentSsid(java.lang.String r1) {
            r0 = this;
            r0.componentSsid = r1
            return
    }

    public void setEventStrategy(com.beizi.fusion.model.AdSpacesBean.EventStrategyBean r1) {
            r0 = this;
            r0.eventStrategy = r1
            return
    }

    public void setFilter(com.beizi.fusion.model.AdSpacesBean.FilterBean r1) {
            r0 = this;
            r0.filter = r1
            return
    }

    public void setFilterSsid(java.lang.String r1) {
            r0 = this;
            r0.filterSsid = r1
            return
    }

    public void setModelType(int r1) {
            r0 = this;
            r0.modelType = r1
            return
    }

    public void setSpaceId(java.lang.String r1) {
            r0 = this;
            r0.spaceId = r1
            return
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AdSpacesBean{spaceId='"
            r0.append(r1)
            java.lang.String r1 = r3.spaceId
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", appId='"
            r0.append(r2)
            java.lang.String r2 = r3.appId
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", adType='"
            r0.append(r2)
            java.lang.String r2 = r3.adType
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", modelType="
            r0.append(r1)
            int r1 = r3.modelType
            r0.append(r1)
            java.lang.String r1 = ", filter="
            r0.append(r1)
            com.beizi.fusion.model.AdSpacesBean$FilterBean r1 = r3.filter
            r0.append(r1)
            java.lang.String r1 = ", bid="
            r0.append(r1)
            com.beizi.fusion.model.AdSpacesBean$BidBean r1 = r3.bid
            r0.append(r1)
            java.lang.String r1 = ", buyer="
            r0.append(r1)
            java.util.List<com.beizi.fusion.model.AdSpacesBean$BuyerBean> r1 = r3.buyer
            r0.append(r1)
            java.lang.String r1 = ", component="
            r0.append(r1)
            com.beizi.fusion.model.AdSpacesBean$ComponentBean r1 = r3.component
            r0.append(r1)
            java.lang.String r1 = ", eventStrategy="
            r0.append(r1)
            com.beizi.fusion.model.AdSpacesBean$EventStrategyBean r1 = r3.eventStrategy
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
