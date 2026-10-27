package com.bxkj.student.common.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HomeMenuDB {
    private java.lang.String iconResName;
    private int id;
    private java.lang.String menuName;

    public HomeMenuDB() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getIconResName() {
            r1 = this;
            java.lang.String r0 = r1.iconResName
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String getMenuName() {
            r1 = this;
            java.lang.String r0 = r1.menuName
            return r0
    }

    public com.bxkj.student.common.db.HomeMenuDB setIconResName(java.lang.String r1) {
            r0 = this;
            r0.iconResName = r1
            return r0
    }

    public com.bxkj.student.common.db.HomeMenuDB setId(int r1) {
            r0 = this;
            r0.id = r1
            return r0
    }

    public com.bxkj.student.common.db.HomeMenuDB setMenuName(java.lang.String r1) {
            r0 = this;
            r0.menuName = r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HomeMenuDB{id="
            r0.append(r1)
            int r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ", iconResName='"
            r0.append(r1)
            java.lang.String r1 = r3.iconResName
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", menuName='"
            r0.append(r2)
            java.lang.String r2 = r3.menuName
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
