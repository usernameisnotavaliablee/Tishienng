package com.amap.api.services.auto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Classify implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify> CREATOR = null;
    public com.amap.api.services.auto.Classify.ItermData itermData;
    public com.amap.api.services.auto.Classify.RetainState retainState;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Category implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Category> CREATOR = null;
        public int checked;
        public java.lang.String classifyItemType;
        public java.lang.String componentType;
        public int defaultValue;
        public java.lang.String img;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String showType;
        public java.lang.String value;


        static {
                com.amap.api.services.auto.Classify$Category$1 r0 = new com.amap.api.services.auto.Classify$Category$1
                r0.<init>()
                com.amap.api.services.auto.Classify.Category.CREATOR = r0
                return
        }

        public Category() {
                r0 = this;
                r0.<init>()
                return
        }

        protected Category(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.checked = r0
                java.lang.String r0 = r2.readString()
                r1.componentType = r0
                int r0 = r2.readInt()
                r1.defaultValue = r0
                java.lang.String r0 = r2.readString()
                r1.name = r0
                java.lang.String r0 = r2.readString()
                r1.params = r0
                java.lang.String r0 = r2.readString()
                r1.value = r0
                java.lang.String r0 = r2.readString()
                r1.classifyItemType = r0
                java.lang.String r0 = r2.readString()
                r1.img = r0
                java.lang.String r2 = r2.readString()
                r1.showType = r2
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
                int r2 = r0.checked
                r1.writeInt(r2)
                java.lang.String r2 = r0.componentType
                r1.writeString(r2)
                int r2 = r0.defaultValue
                r1.writeInt(r2)
                java.lang.String r2 = r0.name
                r1.writeString(r2)
                java.lang.String r2 = r0.params
                r1.writeString(r2)
                java.lang.String r2 = r0.value
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyItemType
                r1.writeString(r2)
                java.lang.String r2 = r0.img
                r1.writeString(r2)
                java.lang.String r2 = r0.showType
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CheckedNode implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedNode> CREATOR = null;
        public java.lang.String id;
        public java.lang.String name;
        public java.lang.String value;


        static {
                com.amap.api.services.auto.Classify$CheckedNode$1 r0 = new com.amap.api.services.auto.Classify$CheckedNode$1
                r0.<init>()
                com.amap.api.services.auto.Classify.CheckedNode.CREATOR = r0
                return
        }

        public CheckedNode() {
                r0 = this;
                r0.<init>()
                return
        }

        protected CheckedNode(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.id = r0
                java.lang.String r0 = r2.readString()
                r1.value = r0
                java.lang.String r2 = r2.readString()
                r1.name = r2
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
                java.lang.String r2 = r0.id
                r1.writeString(r2)
                java.lang.String r2 = r0.value
                r1.writeString(r2)
                java.lang.String r2 = r0.name
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CheckedValue implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.CheckedValue> CREATOR = null;
        public java.lang.String classifyV2Data;
        public java.lang.String classifyV2Level2Data;
        public java.lang.String classifyV2Level3Data;


        static {
                com.amap.api.services.auto.Classify$CheckedValue$1 r0 = new com.amap.api.services.auto.Classify$CheckedValue$1
                r0.<init>()
                com.amap.api.services.auto.Classify.CheckedValue.CREATOR = r0
                return
        }

        public CheckedValue() {
                r0 = this;
                r0.<init>()
                return
        }

        protected CheckedValue(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.classifyV2Data = r0
                java.lang.String r0 = r2.readString()
                r1.classifyV2Level2Data = r0
                java.lang.String r2 = r2.readString()
                r1.classifyV2Level3Data = r2
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
                java.lang.String r2 = r0.classifyV2Data
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyV2Level2Data
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyV2Level3Data
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Data implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.Data> CREATOR = null;
        public java.util.List<com.amap.api.services.auto.Classify.DataCategory> categories;
        public int checked;
        public java.lang.String classifyItemType;
        public int isCancelDefaultSelect;
        public int isNoBtn;
        public int multiSelect;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String separator;
        public java.lang.String type;
        public int useCommonlyUsedConfig;
        public int useLocalConfig;
        public int useRemoteConfig;


        static {
                com.amap.api.services.auto.Classify$Data$1 r0 = new com.amap.api.services.auto.Classify$Data$1
                r0.<init>()
                com.amap.api.services.auto.Classify.Data.CREATOR = r0
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
                android.os.Parcelable$Creator<com.amap.api.services.auto.Classify$DataCategory> r0 = com.amap.api.services.auto.Classify.DataCategory.CREATOR
                java.util.ArrayList r0 = r2.createTypedArrayList(r0)
                r1.categories = r0
                int r0 = r2.readInt()
                r1.checked = r0
                java.lang.String r0 = r2.readString()
                r1.classifyItemType = r0
                int r0 = r2.readInt()
                r1.isCancelDefaultSelect = r0
                int r0 = r2.readInt()
                r1.isNoBtn = r0
                java.lang.String r0 = r2.readString()
                r1.name = r0
                java.lang.String r0 = r2.readString()
                r1.params = r0
                java.lang.String r0 = r2.readString()
                r1.separator = r0
                java.lang.String r0 = r2.readString()
                r1.type = r0
                int r0 = r2.readInt()
                r1.useCommonlyUsedConfig = r0
                int r0 = r2.readInt()
                r1.useLocalConfig = r0
                int r0 = r2.readInt()
                r1.useRemoteConfig = r0
                int r2 = r2.readInt()
                r1.multiSelect = r2
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
                java.util.List<com.amap.api.services.auto.Classify$DataCategory> r2 = r0.categories
                r1.writeTypedList(r2)
                int r2 = r0.checked
                r1.writeInt(r2)
                java.lang.String r2 = r0.classifyItemType
                r1.writeString(r2)
                int r2 = r0.isCancelDefaultSelect
                r1.writeInt(r2)
                int r2 = r0.isNoBtn
                r1.writeInt(r2)
                java.lang.String r2 = r0.name
                r1.writeString(r2)
                java.lang.String r2 = r0.params
                r1.writeString(r2)
                java.lang.String r2 = r0.separator
                r1.writeString(r2)
                java.lang.String r2 = r0.type
                r1.writeString(r2)
                int r2 = r0.useCommonlyUsedConfig
                r1.writeInt(r2)
                int r2 = r0.useLocalConfig
                r1.writeInt(r2)
                int r2 = r0.useRemoteConfig
                r1.writeInt(r2)
                int r2 = r0.multiSelect
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DataCategory implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.DataCategory> CREATOR = null;
        public int areaSubwayMark;
        public java.util.List<com.amap.api.services.auto.Classify.Category> categories;
        public int checked;
        public java.lang.String classifyItemType;
        public java.lang.String componentType;
        public int defaultValue;
        public int hideTitle;
        public java.lang.String img;
        public int maxShowNum;
        public int maxShowNumRow;
        public int multiSelect;
        public java.lang.String name;
        public java.lang.String params;
        public java.lang.String showType;
        public java.lang.String value;


        static {
                com.amap.api.services.auto.Classify$DataCategory$1 r0 = new com.amap.api.services.auto.Classify$DataCategory$1
                r0.<init>()
                com.amap.api.services.auto.Classify.DataCategory.CREATOR = r0
                return
        }

        public DataCategory() {
                r0 = this;
                r0.<init>()
                return
        }

        protected DataCategory(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                android.os.Parcelable$Creator<com.amap.api.services.auto.Classify$Category> r0 = com.amap.api.services.auto.Classify.Category.CREATOR
                java.util.ArrayList r0 = r2.createTypedArrayList(r0)
                r1.categories = r0
                int r0 = r2.readInt()
                r1.checked = r0
                int r0 = r2.readInt()
                r1.defaultValue = r0
                java.lang.String r0 = r2.readString()
                r1.componentType = r0
                java.lang.String r0 = r2.readString()
                r1.name = r0
                java.lang.String r0 = r2.readString()
                r1.params = r0
                int r0 = r2.readInt()
                r1.areaSubwayMark = r0
                int r0 = r2.readInt()
                r1.hideTitle = r0
                int r0 = r2.readInt()
                r1.maxShowNum = r0
                int r0 = r2.readInt()
                r1.maxShowNumRow = r0
                int r0 = r2.readInt()
                r1.multiSelect = r0
                java.lang.String r0 = r2.readString()
                r1.img = r0
                java.lang.String r0 = r2.readString()
                r1.showType = r0
                java.lang.String r0 = r2.readString()
                r1.value = r0
                java.lang.String r2 = r2.readString()
                r1.classifyItemType = r2
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
                java.util.List<com.amap.api.services.auto.Classify$Category> r2 = r0.categories
                r1.writeTypedList(r2)
                int r2 = r0.checked
                r1.writeInt(r2)
                int r2 = r0.defaultValue
                r1.writeInt(r2)
                java.lang.String r2 = r0.componentType
                r1.writeString(r2)
                java.lang.String r2 = r0.name
                r1.writeString(r2)
                java.lang.String r2 = r0.params
                r1.writeString(r2)
                int r2 = r0.areaSubwayMark
                r1.writeInt(r2)
                int r2 = r0.hideTitle
                r1.writeInt(r2)
                int r2 = r0.maxShowNum
                r1.writeInt(r2)
                int r2 = r0.maxShowNumRow
                r1.writeInt(r2)
                int r2 = r0.multiSelect
                r1.writeInt(r2)
                java.lang.String r2 = r0.img
                r1.writeString(r2)
                java.lang.String r2 = r0.showType
                r1.writeString(r2)
                java.lang.String r2 = r0.value
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyItemType
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ItermData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.ItermData> CREATOR = null;
        public java.util.List<com.amap.api.services.auto.Classify.CheckedNode> checkedNodes;
        public com.amap.api.services.auto.Classify.CheckedValue checkedValue;
        public java.util.List<com.amap.api.services.auto.Classify.Data> datas;
        public java.util.List<com.amap.api.services.auto.Classify.Data> defaultPositionDatas;
        public java.util.List<com.amap.api.services.auto.Classify.Data> level2Datas;


        static {
                com.amap.api.services.auto.Classify$ItermData$1 r0 = new com.amap.api.services.auto.Classify$ItermData$1
                r0.<init>()
                com.amap.api.services.auto.Classify.ItermData.CREATOR = r0
                return
        }

        public ItermData() {
                r0 = this;
                r0.<init>()
                return
        }

        protected ItermData(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                android.os.Parcelable$Creator<com.amap.api.services.auto.Classify$CheckedNode> r0 = com.amap.api.services.auto.Classify.CheckedNode.CREATOR
                java.util.ArrayList r0 = r3.createTypedArrayList(r0)
                r2.checkedNodes = r0
                java.lang.Class<com.amap.api.services.auto.Classify$CheckedValue> r0 = com.amap.api.services.auto.Classify.CheckedValue.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r3.readParcelable(r0)
                com.amap.api.services.auto.Classify$CheckedValue r0 = (com.amap.api.services.auto.Classify.CheckedValue) r0
                r2.checkedValue = r0
                android.os.Parcelable$Creator<com.amap.api.services.auto.Classify$Data> r0 = com.amap.api.services.auto.Classify.Data.CREATOR
                java.util.ArrayList r1 = r3.createTypedArrayList(r0)
                r2.datas = r1
                java.util.ArrayList r1 = r3.createTypedArrayList(r0)
                r2.defaultPositionDatas = r1
                java.util.ArrayList r3 = r3.createTypedArrayList(r0)
                r2.level2Datas = r3
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
                java.util.List<com.amap.api.services.auto.Classify$CheckedNode> r0 = r1.checkedNodes
                r2.writeTypedList(r0)
                com.amap.api.services.auto.Classify$CheckedValue r0 = r1.checkedValue
                r2.writeParcelable(r0, r3)
                java.util.List<com.amap.api.services.auto.Classify$Data> r3 = r1.datas
                r2.writeTypedList(r3)
                java.util.List<com.amap.api.services.auto.Classify$Data> r3 = r1.defaultPositionDatas
                r2.writeTypedList(r3)
                java.util.List<com.amap.api.services.auto.Classify$Data> r3 = r1.level2Datas
                r2.writeTypedList(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RetainState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.amap.api.services.auto.Classify.RetainState> CREATOR = null;
        public java.lang.String classifyBusinessType;
        public java.lang.String classifyConf;
        public java.lang.String classifyRetainLevel2;
        public java.lang.String level2All;
        public java.lang.String newClassifyCityadcode;
        public java.lang.String newClassifyFlag;


        static {
                com.amap.api.services.auto.Classify$RetainState$1 r0 = new com.amap.api.services.auto.Classify$RetainState$1
                r0.<init>()
                com.amap.api.services.auto.Classify.RetainState.CREATOR = r0
                return
        }

        public RetainState() {
                r0 = this;
                r0.<init>()
                return
        }

        protected RetainState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.classifyBusinessType = r0
                java.lang.String r0 = r2.readString()
                r1.classifyConf = r0
                java.lang.String r0 = r2.readString()
                r1.classifyRetainLevel2 = r0
                java.lang.String r0 = r2.readString()
                r1.level2All = r0
                java.lang.String r0 = r2.readString()
                r1.newClassifyCityadcode = r0
                java.lang.String r2 = r2.readString()
                r1.newClassifyFlag = r2
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
                java.lang.String r2 = r0.classifyBusinessType
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyConf
                r1.writeString(r2)
                java.lang.String r2 = r0.classifyRetainLevel2
                r1.writeString(r2)
                java.lang.String r2 = r0.level2All
                r1.writeString(r2)
                java.lang.String r2 = r0.newClassifyCityadcode
                r1.writeString(r2)
                java.lang.String r2 = r0.newClassifyFlag
                r1.writeString(r2)
                return
        }
    }

    static {
            com.amap.api.services.auto.Classify$1 r0 = new com.amap.api.services.auto.Classify$1
            r0.<init>()
            com.amap.api.services.auto.Classify.CREATOR = r0
            return
    }

    public Classify() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Classify(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<com.amap.api.services.auto.Classify$ItermData> r0 = com.amap.api.services.auto.Classify.ItermData.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.amap.api.services.auto.Classify$ItermData r0 = (com.amap.api.services.auto.Classify.ItermData) r0
            r1.itermData = r0
            java.lang.Class<com.amap.api.services.auto.Classify$RetainState> r0 = com.amap.api.services.auto.Classify.RetainState.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            com.amap.api.services.auto.Classify$RetainState r2 = (com.amap.api.services.auto.Classify.RetainState) r2
            r1.retainState = r2
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
            com.amap.api.services.auto.Classify$ItermData r0 = r1.itermData
            r2.writeParcelable(r0, r3)
            com.amap.api.services.auto.Classify$RetainState r0 = r1.retainState
            r2.writeParcelable(r0, r3)
            return
    }
}
