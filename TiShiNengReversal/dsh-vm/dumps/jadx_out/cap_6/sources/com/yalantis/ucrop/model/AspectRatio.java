package com.yalantis.ucrop.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AspectRatio implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.yalantis.ucrop.model.AspectRatio> CREATOR = null;

    @androidx.annotation.Nullable
    private final java.lang.String a;
    private final float b;
    private final float c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements android.os.Parcelable.Creator<com.yalantis.ucrop.model.AspectRatio> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.yalantis.ucrop.model.AspectRatio a(android.os.Parcel r2) {
                r1 = this;
                com.yalantis.ucrop.model.AspectRatio r0 = new com.yalantis.ucrop.model.AspectRatio
                r0.<init>(r2)
                return r0
        }

        public com.yalantis.ucrop.model.AspectRatio[] b(int r1) {
                r0 = this;
                com.yalantis.ucrop.model.AspectRatio[] r1 = new com.yalantis.ucrop.model.AspectRatio[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.yalantis.ucrop.model.AspectRatio createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.yalantis.ucrop.model.AspectRatio r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.yalantis.ucrop.model.AspectRatio[] newArray(int r1) {
                r0 = this;
                com.yalantis.ucrop.model.AspectRatio[] r1 = r0.b(r1)
                return r1
        }
    }

    static {
            com.yalantis.ucrop.model.AspectRatio$a r0 = new com.yalantis.ucrop.model.AspectRatio$a
            r0.<init>()
            com.yalantis.ucrop.model.AspectRatio.CREATOR = r0
            return
    }

    protected AspectRatio(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.readString()
            r1.a = r0
            float r0 = r2.readFloat()
            r1.b = r0
            float r2 = r2.readFloat()
            r1.c = r2
            return
    }

    public AspectRatio(@androidx.annotation.Nullable java.lang.String r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public float b() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    public float c() {
            r1 = this;
            float r0 = r1.c
            return r0
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
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            float r2 = r0.b
            r1.writeFloat(r2)
            float r2 = r0.c
            r1.writeFloat(r2)
            return
    }
}
