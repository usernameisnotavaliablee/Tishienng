package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.liantian.core.c> CREATOR = null;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f5946b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f5947c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f5948d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f5949e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f5950f;


    static {
            com.baidu.liantian.core.c$1 r0 = new com.baidu.liantian.core.c$1
            r0.<init>()
            com.baidu.liantian.core.c.CREATOR = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    protected c(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.a = r0
            int r0 = r3.readInt()
            r2.f5946b = r0
            java.lang.String r0 = r3.readString()
            r2.f5947c = r0
            java.lang.Class<com.baidu.liantian.core.c> r0 = com.baidu.liantian.core.c.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object[] r1 = r3.readArray(r1)
            r2.f5949e = r1
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object[] r1 = r3.readArray(r1)
            r2.f5948d = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r3 = r3.readValue(r0)
            r2.f5950f = r3
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
            int r2 = r0.a
            r1.writeInt(r2)
            int r2 = r0.f5946b
            r1.writeInt(r2)
            java.lang.String r2 = r0.f5947c
            r1.writeString(r2)
            java.lang.Object[] r2 = r0.f5949e
            r1.writeArray(r2)
            java.lang.Object[] r2 = r0.f5948d
            r1.writeArray(r2)
            java.lang.Object r2 = r0.f5950f
            r1.writeValue(r2)
            return
    }
}
