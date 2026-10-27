package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class FieldWriter {
    private final int access;
    private final int desc;
    private final int name;
    com.alibaba.fastjson.asm.FieldWriter next;

    public FieldWriter(com.alibaba.fastjson.asm.ClassWriter r2, int r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            com.alibaba.fastjson.asm.FieldWriter r0 = r2.firstField
            if (r0 != 0) goto La
            r2.firstField = r1
            goto Le
        La:
            com.alibaba.fastjson.asm.FieldWriter r0 = r2.lastField
            r0.next = r1
        Le:
            r2.lastField = r1
            r1.access = r3
            int r3 = r2.newUTF8(r4)
            r1.name = r3
            int r2 = r2.newUTF8(r5)
            r1.desc = r2
            return
    }

    int getSize() {
            r1 = this;
            r0 = 8
            return r0
    }

    void put(com.alibaba.fastjson.asm.ByteVector r3) {
            r2 = this;
            int r0 = r2.access
            r1 = -393217(0xfffffffffff9ffff, float:NaN)
            r0 = r0 & r1
            com.alibaba.fastjson.asm.ByteVector r0 = r3.putShort(r0)
            int r1 = r2.name
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r2.desc
            r0.putShort(r1)
            r0 = 0
            r3.putShort(r0)
            return
    }

    public void visitEnd() {
            r0 = this;
            return
    }
}
