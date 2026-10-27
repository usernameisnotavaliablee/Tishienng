package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface MethodVisitor {
    void visitEnd();

    void visitFieldInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    void visitIincInsn(int r1, int r2);

    void visitInsn(int r1);

    void visitIntInsn(int r1, int r2);

    void visitJumpInsn(int r1, com.alibaba.fastjson.asm.Label r2);

    void visitLabel(com.alibaba.fastjson.asm.Label r1);

    void visitLdcInsn(java.lang.Object r1);

    void visitMaxs(int r1, int r2);

    void visitMethodInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    void visitTypeInsn(int r1, java.lang.String r2);

    void visitVarInsn(int r1, int r2);
}
