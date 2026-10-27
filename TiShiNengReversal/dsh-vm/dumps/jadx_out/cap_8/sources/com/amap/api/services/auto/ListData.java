package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ListData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData> CREATOR = null;
    public java.util.List<com.amap.api.services.auto.ListData.Content> content;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class BasicInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.BasicInfo> CREATOR = null;
        public java.lang.String adcode;
        public java.lang.String address;
        public java.lang.String averagecost;
        public java.lang.String buildingStatus;
        public java.lang.String businessArea;
        public java.lang.String category;
        public java.lang.String childShortname;
        public java.lang.String childShortnameEn;
        public java.lang.String childtype;
        public java.lang.String citycode;
        public java.lang.String cname;
        public java.lang.String dispName;
        public java.lang.String distance;
        public java.lang.String dname;
        public java.lang.String eaddress;
        public java.lang.String endPoiExtension;
        public java.lang.String fNona;
        public java.lang.String hisMark;
        public java.lang.String hotText;
        public java.lang.String id;
        public java.lang.String industry;
        public java.lang.String latitude;
        public java.lang.String longitude;
        public java.lang.String name;
        public com.amap.api.services.auto.ListData.NaviVisited naviVisited;
        public java.lang.String numSpaceW;
        public java.lang.String numSpaceWF;
        public java.lang.String opentime2;
        public java.lang.String opentimeText;
        public java.lang.String parent;
        public java.lang.String parentName;
        public java.lang.String picInfo;
        public java.lang.String rating;
        public java.lang.String recommendFlag;
        public java.lang.String reviewTotal;
        public java.lang.String sell;
        public com.amap.api.services.auto.ListData.ShortReview shortReview;
        public java.lang.String tel;
        public java.lang.String towardsAngle;
        public java.lang.String typeCode;
        public java.lang.String updateFlag;
        public java.lang.String xEntr;
        public java.lang.String yEntr;


        static {
                com.amap.api.services.auto.ListData$BasicInfo$1 r0 = new com.amap.api.services.auto.ListData$BasicInfo$1
                r0.<init>()
                com.amap.api.services.auto.ListData.BasicInfo.CREATOR = r0
                return
        }

        public BasicInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected BasicInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.adcode = r0
                java.lang.String r0 = r2.readString()
                r1.address = r0
                java.lang.String r0 = r2.readString()
                r1.averagecost = r0
                java.lang.String r0 = r2.readString()
                r1.buildingStatus = r0
                java.lang.String r0 = r2.readString()
                r1.businessArea = r0
                java.lang.String r0 = r2.readString()
                r1.childShortname = r0
                java.lang.String r0 = r2.readString()
                r1.childShortnameEn = r0
                java.lang.String r0 = r2.readString()
                r1.childtype = r0
                java.lang.String r0 = r2.readString()
                r1.citycode = r0
                java.lang.String r0 = r2.readString()
                r1.cname = r0
                java.lang.String r0 = r2.readString()
                r1.dispName = r0
                java.lang.String r0 = r2.readString()
                r1.distance = r0
                java.lang.String r0 = r2.readString()
                r1.dname = r0
                java.lang.String r0 = r2.readString()
                r1.eaddress = r0
                java.lang.String r0 = r2.readString()
                r1.endPoiExtension = r0
                java.lang.String r0 = r2.readString()
                r1.fNona = r0
                java.lang.String r0 = r2.readString()
                r1.hisMark = r0
                java.lang.String r0 = r2.readString()
                r1.hotText = r0
                java.lang.String r0 = r2.readString()
                r1.id = r0
                java.lang.String r0 = r2.readString()
                r1.industry = r0
                java.lang.String r0 = r2.readString()
                r1.latitude = r0
                java.lang.String r0 = r2.readString()
                r1.longitude = r0
                java.lang.String r0 = r2.readString()
                r1.name = r0
                java.lang.Class<com.amap.api.services.auto.ListData$NaviVisited> r0 = com.amap.api.services.auto.ListData.NaviVisited.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.auto.ListData$NaviVisited r0 = (com.amap.api.services.auto.ListData.NaviVisited) r0
                r1.naviVisited = r0
                java.lang.String r0 = r2.readString()
                r1.numSpaceW = r0
                java.lang.String r0 = r2.readString()
                r1.numSpaceWF = r0
                java.lang.String r0 = r2.readString()
                r1.opentime2 = r0
                java.lang.String r0 = r2.readString()
                r1.opentimeText = r0
                java.lang.String r0 = r2.readString()
                r1.parent = r0
                java.lang.String r0 = r2.readString()
                r1.parentName = r0
                java.lang.String r0 = r2.readString()
                r1.picInfo = r0
                java.lang.String r0 = r2.readString()
                r1.rating = r0
                java.lang.String r0 = r2.readString()
                r1.recommendFlag = r0
                java.lang.String r0 = r2.readString()
                r1.reviewTotal = r0
                java.lang.String r0 = r2.readString()
                r1.sell = r0
                java.lang.String r0 = r2.readString()
                r1.tel = r0
                java.lang.String r0 = r2.readString()
                r1.towardsAngle = r0
                java.lang.String r0 = r2.readString()
                r1.typeCode = r0
                java.lang.String r0 = r2.readString()
                r1.updateFlag = r0
                java.lang.String r0 = r2.readString()
                r1.xEntr = r0
                java.lang.String r0 = r2.readString()
                r1.yEntr = r0
                java.lang.String r2 = r2.readString()
                r1.category = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.adcode
                r2.writeString(r0)
                java.lang.String r0 = r1.address
                r2.writeString(r0)
                java.lang.String r0 = r1.averagecost
                r2.writeString(r0)
                java.lang.String r0 = r1.buildingStatus
                r2.writeString(r0)
                java.lang.String r0 = r1.businessArea
                r2.writeString(r0)
                java.lang.String r0 = r1.childShortname
                r2.writeString(r0)
                java.lang.String r0 = r1.childShortnameEn
                r2.writeString(r0)
                java.lang.String r0 = r1.childtype
                r2.writeString(r0)
                java.lang.String r0 = r1.citycode
                r2.writeString(r0)
                java.lang.String r0 = r1.cname
                r2.writeString(r0)
                java.lang.String r0 = r1.dispName
                r2.writeString(r0)
                java.lang.String r0 = r1.distance
                r2.writeString(r0)
                java.lang.String r0 = r1.dname
                r2.writeString(r0)
                java.lang.String r0 = r1.eaddress
                r2.writeString(r0)
                java.lang.String r0 = r1.endPoiExtension
                r2.writeString(r0)
                java.lang.String r0 = r1.fNona
                r2.writeString(r0)
                java.lang.String r0 = r1.hisMark
                r2.writeString(r0)
                java.lang.String r0 = r1.hotText
                r2.writeString(r0)
                java.lang.String r0 = r1.id
                r2.writeString(r0)
                java.lang.String r0 = r1.industry
                r2.writeString(r0)
                java.lang.String r0 = r1.latitude
                r2.writeString(r0)
                java.lang.String r0 = r1.longitude
                r2.writeString(r0)
                java.lang.String r0 = r1.name
                r2.writeString(r0)
                com.amap.api.services.auto.ListData$NaviVisited r0 = r1.naviVisited
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.numSpaceW
                r2.writeString(r3)
                java.lang.String r3 = r1.numSpaceWF
                r2.writeString(r3)
                java.lang.String r3 = r1.opentime2
                r2.writeString(r3)
                java.lang.String r3 = r1.opentimeText
                r2.writeString(r3)
                java.lang.String r3 = r1.parent
                r2.writeString(r3)
                java.lang.String r3 = r1.parentName
                r2.writeString(r3)
                java.lang.String r3 = r1.picInfo
                r2.writeString(r3)
                java.lang.String r3 = r1.rating
                r2.writeString(r3)
                java.lang.String r3 = r1.recommendFlag
                r2.writeString(r3)
                java.lang.String r3 = r1.reviewTotal
                r2.writeString(r3)
                java.lang.String r3 = r1.sell
                r2.writeString(r3)
                java.lang.String r3 = r1.tel
                r2.writeString(r3)
                java.lang.String r3 = r1.towardsAngle
                r2.writeString(r3)
                java.lang.String r3 = r1.typeCode
                r2.writeString(r3)
                java.lang.String r3 = r1.updateFlag
                r2.writeString(r3)
                java.lang.String r3 = r1.xEntr
                r2.writeString(r3)
                java.lang.String r3 = r1.yEntr
                r2.writeString(r3)
                java.lang.String r3 = r1.category
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ChargeInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargeInfo> CREATOR = null;
        public java.util.List<com.amap.api.services.auto.ListData.PlugsInfo> plugsInfos;
        public java.lang.String plugsType;


        static {
                com.amap.api.services.auto.ListData$ChargeInfo$1 r0 = new com.amap.api.services.auto.ListData$ChargeInfo$1
                r0.<init>()
                com.amap.api.services.auto.ListData.ChargeInfo.CREATOR = r0
                return
        }

        public ChargeInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected ChargeInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.plugsType = r0
                android.os.Parcelable$Creator<com.amap.api.services.auto.ListData$PlugsInfo> r0 = com.amap.api.services.auto.ListData.PlugsInfo.CREATOR
                java.util.ArrayList r2 = r2.createTypedArrayList(r0)
                r1.plugsInfos = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.plugsType
                r1.writeString(r2)
                java.util.List<com.amap.api.services.auto.ListData$PlugsInfo> r2 = r0.plugsInfos
                r1.writeTypedList(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ChargingInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.ChargingInfo> CREATOR = null;
        public java.lang.String brandDesc;
        public java.util.List<com.amap.api.services.auto.ListData.ChargeInfo> chargeInfo;
        public java.lang.String chargingRatingFlagTerm;
        public java.lang.String creditZhima;
        public java.lang.String cscf;
        public java.lang.String currentElePrice;
        public java.lang.String currentSerPrice;
        public java.lang.String deepRightsTag;
        public java.util.HashMap<java.lang.String, java.lang.String> idDictionary;
        public java.lang.String latestCharge;
        public java.lang.String numFast;
        public java.lang.String numSlow;
        public java.lang.String parkCategory;
        public com.amap.api.services.auto.ListData.PriceChargingPark priceChargingPark;
        public java.lang.String priceParkingStd;


        static {
                com.amap.api.services.auto.ListData$ChargingInfo$1 r0 = new com.amap.api.services.auto.ListData$ChargingInfo$1
                r0.<init>()
                com.amap.api.services.auto.ListData.ChargingInfo.CREATOR = r0
                return
        }

        public ChargingInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected ChargingInfo(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = r3.readString()
                r2.brandDesc = r0
                android.os.Parcelable$Creator<com.amap.api.services.auto.ListData$ChargeInfo> r0 = com.amap.api.services.auto.ListData.ChargeInfo.CREATOR
                java.util.ArrayList r0 = r3.createTypedArrayList(r0)
                r2.chargeInfo = r0
                java.lang.String r0 = r3.readString()
                r2.chargingRatingFlagTerm = r0
                java.lang.String r0 = r3.readString()
                r2.creditZhima = r0
                java.lang.String r0 = r3.readString()
                r2.cscf = r0
                java.lang.String r0 = r3.readString()
                r2.currentElePrice = r0
                java.lang.String r0 = r3.readString()
                r2.currentSerPrice = r0
                java.lang.String r0 = r3.readString()
                r2.deepRightsTag = r0
                java.lang.String r0 = r3.readString()
                r2.latestCharge = r0
                java.lang.String r0 = r3.readString()
                r2.numFast = r0
                java.lang.String r0 = r3.readString()
                r2.numSlow = r0
                java.lang.String r0 = r3.readString()
                r2.parkCategory = r0
                java.lang.Class<com.amap.api.services.auto.ListData$PriceChargingPark> r0 = com.amap.api.services.auto.ListData.PriceChargingPark.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.auto.ListData$PriceChargingPark r0 = (com.amap.api.services.auto.ListData.PriceChargingPark) r0
                r2.priceChargingPark = r0
                java.lang.String r0 = r3.readString()
                r2.priceParkingStd = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.idDictionary = r0
                java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readMap(r0, r1)
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                java.lang.String r0 = r1.brandDesc
                r2.writeString(r0)
                java.util.List<com.amap.api.services.auto.ListData$ChargeInfo> r0 = r1.chargeInfo
                r2.writeTypedList(r0)
                java.lang.String r0 = r1.chargingRatingFlagTerm
                r2.writeString(r0)
                java.lang.String r0 = r1.creditZhima
                r2.writeString(r0)
                java.lang.String r0 = r1.cscf
                r2.writeString(r0)
                java.lang.String r0 = r1.currentElePrice
                r2.writeString(r0)
                java.lang.String r0 = r1.currentSerPrice
                r2.writeString(r0)
                java.lang.String r0 = r1.deepRightsTag
                r2.writeString(r0)
                java.lang.String r0 = r1.latestCharge
                r2.writeString(r0)
                java.lang.String r0 = r1.numFast
                r2.writeString(r0)
                java.lang.String r0 = r1.numSlow
                r2.writeString(r0)
                java.lang.String r0 = r1.parkCategory
                r2.writeString(r0)
                com.amap.api.services.auto.ListData$PriceChargingPark r0 = r1.priceChargingPark
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.priceParkingStd
                r2.writeString(r3)
                java.util.HashMap<java.lang.String, java.lang.String> r3 = r1.idDictionary
                r2.writeMap(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Content implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Content> CREATOR = null;
        public com.amap.api.services.auto.ListData.Data data;
        public java.lang.String itemType;


        static {
                com.amap.api.services.auto.ListData$Content$1 r0 = new com.amap.api.services.auto.ListData$Content$1
                r0.<init>()
                com.amap.api.services.auto.ListData.Content.CREATOR = r0
                return
        }

        public Content() {
                r0 = this;
                r0.<init>()
                return
        }

        protected Content(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class<com.amap.api.services.auto.ListData$Data> r0 = com.amap.api.services.auto.ListData.Data.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.auto.ListData$Data r0 = (com.amap.api.services.auto.ListData.Data) r0
                r1.data = r0
                java.lang.String r2 = r2.readString()
                r1.itemType = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.auto.ListData$Data r0 = r1.data
                r2.writeParcelable(r0, r3)
                java.lang.String r3 = r1.itemType
                r2.writeString(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Data implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Data> CREATOR = null;
        public com.amap.api.services.auto.ListData.BasicInfo basicInfo;
        public com.amap.api.services.auto.ListData.ChargingInfo chargingInfo;


        static {
                com.amap.api.services.auto.ListData$Data$1 r0 = new com.amap.api.services.auto.ListData$Data$1
                r0.<init>()
                com.amap.api.services.auto.ListData.Data.CREATOR = r0
                return
        }

        public Data() {
                r0 = this;
                r0.<init>()
                return
        }

        protected Data(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class<com.amap.api.services.auto.ListData$BasicInfo> r0 = com.amap.api.services.auto.ListData.BasicInfo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r2.readParcelable(r0)
                com.amap.api.services.auto.ListData$BasicInfo r0 = (com.amap.api.services.auto.ListData.BasicInfo) r0
                r1.basicInfo = r0
                java.lang.Class<com.amap.api.services.auto.ListData$ChargingInfo> r0 = com.amap.api.services.auto.ListData.ChargingInfo.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r2 = r2.readParcelable(r0)
                com.amap.api.services.auto.ListData$ChargingInfo r2 = (com.amap.api.services.auto.ListData.ChargingInfo) r2
                r1.chargingInfo = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                com.amap.api.services.auto.ListData$BasicInfo r0 = r1.basicInfo
                r2.writeParcelable(r0, r3)
                com.amap.api.services.auto.ListData$ChargingInfo r0 = r1.chargingInfo
                r2.writeParcelable(r0, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class NaviVisited implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.NaviVisited> CREATOR = null;
        public java.lang.String randUnionMonthUv;


        static {
                com.amap.api.services.auto.ListData$NaviVisited$1 r0 = new com.amap.api.services.auto.ListData$NaviVisited$1
                r0.<init>()
                com.amap.api.services.auto.ListData.NaviVisited.CREATOR = r0
                return
        }

        public NaviVisited() {
                r0 = this;
                r0.<init>()
                return
        }

        protected NaviVisited(android.os.Parcel r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = r1.readString()
                r0.randUnionMonthUv = r1
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.randUnionMonthUv
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Park implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.Park> CREATOR = null;
        public java.util.List<com.amap.api.services.auto.ListData.PriceCharging> priceChargings;
        public java.lang.String srcType;


        static {
                com.amap.api.services.auto.ListData$Park$1 r0 = new com.amap.api.services.auto.ListData$Park$1
                r0.<init>()
                com.amap.api.services.auto.ListData.Park.CREATOR = r0
                return
        }

        public Park() {
                r0 = this;
                r0.<init>()
                return
        }

        protected Park(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator<com.amap.api.services.auto.ListData$PriceCharging> r0 = com.amap.api.services.auto.ListData.PriceCharging.CREATOR
                java.util.ArrayList r0 = r2.createTypedArrayList(r0)
                r1.priceChargings = r0
                java.lang.String r2 = r2.readString()
                r1.srcType = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.util.List<com.amap.api.services.auto.ListData$PriceCharging> r2 = r0.priceChargings
                r1.writeTypedList(r2)
                java.lang.String r2 = r0.srcType
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PlugsInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PlugsInfo> CREATOR = null;
        public java.lang.String brandDesc;
        public java.lang.String fastcur;
        public java.lang.String fastpower;
        public java.lang.String fastvol;


        static {
                com.amap.api.services.auto.ListData$PlugsInfo$1 r0 = new com.amap.api.services.auto.ListData$PlugsInfo$1
                r0.<init>()
                com.amap.api.services.auto.ListData.PlugsInfo.CREATOR = r0
                return
        }

        public PlugsInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        protected PlugsInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.brandDesc = r0
                java.lang.String r0 = r2.readString()
                r1.fastcur = r0
                java.lang.String r0 = r2.readString()
                r1.fastpower = r0
                java.lang.String r2 = r2.readString()
                r1.fastvol = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.brandDesc
                r1.writeString(r2)
                java.lang.String r2 = r0.fastcur
                r1.writeString(r2)
                java.lang.String r2 = r0.fastpower
                r1.writeString(r2)
                java.lang.String r2 = r0.fastvol
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PriceCharging implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceCharging> CREATOR = null;
        public java.lang.String elePrice;
        public java.lang.String serPrice;
        public java.lang.String time;
        public int updatetime;


        static {
                com.amap.api.services.auto.ListData$PriceCharging$1 r0 = new com.amap.api.services.auto.ListData$PriceCharging$1
                r0.<init>()
                com.amap.api.services.auto.ListData.PriceCharging.CREATOR = r0
                return
        }

        public PriceCharging() {
                r0 = this;
                r0.<init>()
                return
        }

        protected PriceCharging(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.elePrice = r0
                java.lang.String r0 = r2.readString()
                r1.serPrice = r0
                java.lang.String r0 = r2.readString()
                r1.time = r0
                int r2 = r2.readInt()
                r1.updatetime = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.elePrice
                r1.writeString(r2)
                java.lang.String r2 = r0.serPrice
                r1.writeString(r2)
                java.lang.String r2 = r0.time
                r1.writeString(r2)
                int r2 = r0.updatetime
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PriceChargingPark implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.ListData.PriceChargingPark> CREATOR = null;
        public java.util.List<com.amap.api.services.auto.ListData.Park> parks;


        static {
                com.amap.api.services.auto.ListData$PriceChargingPark$1 r0 = new com.amap.api.services.auto.ListData$PriceChargingPark$1
                r0.<init>()
                com.amap.api.services.auto.ListData.PriceChargingPark.CREATOR = r0
                return
        }

        public PriceChargingPark() {
                r0 = this;
                r0.<init>()
                return
        }

        protected PriceChargingPark(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator<com.amap.api.services.auto.ListData$Park> r0 = com.amap.api.services.auto.ListData.Park.CREATOR
                java.util.ArrayList r2 = r2.createTypedArrayList(r0)
                r1.parks = r2
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.util.List<com.amap.api.services.auto.ListData$Park> r2 = r0.parks
                r1.writeTypedList(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ShortReview {
        public ShortReview() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.amap.api.services.auto.ListData$1 r0 = new com.amap.api.services.auto.ListData$1
            r0.<init>()
            com.amap.api.services.auto.ListData.CREATOR = r0
            return
    }

    public ListData() {
            r0 = this;
            r0.<init>()
            return
    }

    protected ListData(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            android.os.Parcelable$Creator<com.amap.api.services.auto.ListData$Content> r0 = com.amap.api.services.auto.ListData.Content.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.content = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<com.amap.api.services.auto.ListData$Content> r2 = r0.content
            r1.writeTypedList(r2)
            return
    }
}
