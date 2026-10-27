package com.huawei.hms.hmsscankit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class DetailRect implements android.os.Parcelable {
    public static final java.lang.String CP_PACKAGE = "PackageName";
    public static final android.os.Parcelable.Creator<com.huawei.hms.hmsscankit.DetailRect> CREATOR = null;
    public static final java.lang.String CUSTOMED_FLAG = "CustomedFlag";
    public static final java.lang.String DEEPLINK_BACK_COLOR = "DeepLinkColor";
    public static final java.lang.String DEEPLINK_JUMP_FLAG = "DeepLinkJumpFlag";
    public static final java.lang.String DEEPLINK_VALUE = "DeepLinkValue";
    public static final int DEFALT_HMS_SCAN_VERSIONU = 0;
    public static final java.lang.String FORMAT_FLAG = "FormatValue";
    public static int HMSSCAN_SDK_VALUE = 3;
    public static final java.lang.String NEW_VERSION = "NewVersion";
    public static final java.lang.String PARSE_RESULT = "ParseResult";
    public static final java.lang.String PHOTO_MODE = "PhotoMode";
    public static final java.lang.String RECT_FLAG = "RectValue";
    public static final java.lang.String RETURN_BITMAP = "return_bitmap";
    public static final java.lang.String SCAN_CAMERA_PERMISSION = "ScanCameraPermission";
    public static final java.lang.String SCAN_LOCAL_DECODER = "localdecoder";
    public static final java.lang.String SCAN_NEW_UI = "localui";
    public static final java.lang.String SCAN_OFFSCEEN_FLAG = "ScanOffSceenFlag";
    public static final java.lang.String SCAN_VIEWTYPE_FLAG = "ScanViewTypeFlag";
    public static final java.lang.String SUPPORT_ROLLBACK = "ROLLBACK";
    public static final java.lang.String TYPE_TRANS = "TransType";
    public static final java.lang.String USE_APK = "USEAPK";
    public static final int VALUE_HMS_SCAN_VERSION = 3;
    public int height;
    public int width;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.os.Parcelable.Creator<com.huawei.hms.hmsscankit.DetailRect> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.huawei.hms.hmsscankit.DetailRect a(android.os.Parcel r2) {
                r1 = this;
                com.huawei.hms.hmsscankit.DetailRect r0 = new com.huawei.hms.hmsscankit.DetailRect
                r0.<init>(r2)
                return r0
        }

        public com.huawei.hms.hmsscankit.DetailRect[] a(int r1) {
                r0 = this;
                com.huawei.hms.hmsscankit.DetailRect[] r1 = new com.huawei.hms.hmsscankit.DetailRect[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.hmsscankit.DetailRect createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.huawei.hms.hmsscankit.DetailRect r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.huawei.hms.hmsscankit.DetailRect[] newArray(int r1) {
                r0 = this;
                com.huawei.hms.hmsscankit.DetailRect[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            com.huawei.hms.hmsscankit.DetailRect$a r0 = new com.huawei.hms.hmsscankit.DetailRect$a
            r0.<init>()
            com.huawei.hms.hmsscankit.DetailRect.CREATOR = r0
            return
    }

    public DetailRect() {
            r0 = this;
            r0.<init>()
            return
    }

    public DetailRect(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            return
    }

    protected DetailRect(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.width = r0
            int r2 = r2.readInt()
            r1.height = r2
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
            int r2 = r0.width
            r1.writeInt(r2)
            int r2 = r0.height
            r1.writeInt(r2)
            return
    }
}
