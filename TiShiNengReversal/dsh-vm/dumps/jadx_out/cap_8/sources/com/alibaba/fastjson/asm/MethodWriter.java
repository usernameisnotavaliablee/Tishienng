package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class MethodWriter implements com.alibaba.fastjson.asm.MethodVisitor {
    private int access;
    private com.alibaba.fastjson.asm.ByteVector code;
    final com.alibaba.fastjson.asm.ClassWriter cw;
    private final int desc;
    int exceptionCount;
    int[] exceptions;
    private int maxLocals;
    private int maxStack;
    private final int name;
    com.alibaba.fastjson.asm.MethodWriter next;

    public MethodWriter(com.alibaba.fastjson.asm.ClassWriter r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String[] r6) {
            r0 = this;
            r0.<init>()
            com.alibaba.fastjson.asm.ByteVector r5 = new com.alibaba.fastjson.asm.ByteVector
            r5.<init>()
            r0.code = r5
            com.alibaba.fastjson.asm.MethodWriter r5 = r1.firstMethod
            if (r5 != 0) goto L11
            r1.firstMethod = r0
            goto L15
        L11:
            com.alibaba.fastjson.asm.MethodWriter r5 = r1.lastMethod
            r5.next = r0
        L15:
            r1.lastMethod = r0
            r0.cw = r1
            r0.access = r2
            int r2 = r1.newUTF8(r3)
            r0.name = r2
            int r2 = r1.newUTF8(r4)
            r0.desc = r2
            if (r6 == 0) goto L47
            int r2 = r6.length
            if (r2 <= 0) goto L47
            int r2 = r6.length
            r0.exceptionCount = r2
            int[] r2 = new int[r2]
            r0.exceptions = r2
            r2 = 0
        L34:
            int r3 = r0.exceptionCount
            if (r2 >= r3) goto L47
            int[] r3 = r0.exceptions
            r4 = r6[r2]
            com.alibaba.fastjson.asm.Item r4 = r1.newClassItem(r4)
            int r4 = r4.index
            r3[r2] = r4
            int r2 = r2 + 1
            goto L34
        L47:
            return
    }

    final int getSize() {
            r4 = this;
            com.alibaba.fastjson.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            r1 = 8
            if (r0 <= 0) goto L16
            com.alibaba.fastjson.asm.ClassWriter r0 = r4.cw
            java.lang.String r2 = "Code"
            r0.newUTF8(r2)
            com.alibaba.fastjson.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            int r0 = r0 + 26
            goto L18
        L16:
            r0 = 8
        L18:
            int r2 = r4.exceptionCount
            if (r2 <= 0) goto L29
            com.alibaba.fastjson.asm.ClassWriter r2 = r4.cw
            java.lang.String r3 = "Exceptions"
            r2.newUTF8(r3)
            int r2 = r4.exceptionCount
            int r2 = r2 * 2
            int r2 = r2 + r1
            int r0 = r0 + r2
        L29:
            return r0
    }

    final void put(com.alibaba.fastjson.asm.ByteVector r5) {
            r4 = this;
            int r0 = r4.access
            r1 = -393217(0xfffffffffff9ffff, float:NaN)
            r0 = r0 & r1
            com.alibaba.fastjson.asm.ByteVector r0 = r5.putShort(r0)
            int r1 = r4.name
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putShort(r1)
            int r1 = r4.desc
            r0.putShort(r1)
            com.alibaba.fastjson.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            r1 = 0
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r2 = r4.exceptionCount
            if (r2 <= 0) goto L25
            int r0 = r0 + 1
        L25:
            r5.putShort(r0)
            com.alibaba.fastjson.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            if (r0 <= 0) goto L61
            int r0 = r0 + 12
            com.alibaba.fastjson.asm.ClassWriter r2 = r4.cw
            java.lang.String r3 = "Code"
            int r2 = r2.newUTF8(r3)
            com.alibaba.fastjson.asm.ByteVector r2 = r5.putShort(r2)
            r2.putInt(r0)
            int r0 = r4.maxStack
            com.alibaba.fastjson.asm.ByteVector r0 = r5.putShort(r0)
            int r2 = r4.maxLocals
            r0.putShort(r2)
            com.alibaba.fastjson.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            com.alibaba.fastjson.asm.ByteVector r0 = r5.putInt(r0)
            com.alibaba.fastjson.asm.ByteVector r2 = r4.code
            byte[] r3 = r2.data
            int r2 = r2.length
            r0.putByteArray(r3, r1, r2)
            r5.putShort(r1)
            r5.putShort(r1)
        L61:
            int r0 = r4.exceptionCount
            if (r0 <= 0) goto L8d
            com.alibaba.fastjson.asm.ClassWriter r0 = r4.cw
            java.lang.String r2 = "Exceptions"
            int r0 = r0.newUTF8(r2)
            com.alibaba.fastjson.asm.ByteVector r0 = r5.putShort(r0)
            int r2 = r4.exceptionCount
            int r2 = r2 * 2
            int r2 = r2 + 2
            r0.putInt(r2)
            int r0 = r4.exceptionCount
            r5.putShort(r0)
        L7f:
            int r0 = r4.exceptionCount
            if (r1 >= r0) goto L8d
            int[] r0 = r4.exceptions
            r0 = r0[r1]
            r5.putShort(r0)
            int r1 = r1 + 1
            goto L7f
        L8d:
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitFieldInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            com.alibaba.fastjson.asm.ClassWriter r0 = r1.cw
            com.alibaba.fastjson.asm.Item r3 = r0.newFieldItem(r3, r4, r5)
            com.alibaba.fastjson.asm.ByteVector r4 = r1.code
            int r3 = r3.index
            r4.put12(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitIincInsn(int r3, int r4) {
            r2 = this;
            com.alibaba.fastjson.asm.ByteVector r0 = r2.code
            r1 = 132(0x84, float:1.85E-43)
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putByte(r1)
            r0.put11(r3, r4)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitInsn(int r2) {
            r1 = this;
            com.alibaba.fastjson.asm.ByteVector r0 = r1.code
            r0.putByte(r2)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitIntInsn(int r2, int r3) {
            r1 = this;
            com.alibaba.fastjson.asm.ByteVector r0 = r1.code
            r0.put11(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitJumpInsn(int r3, com.alibaba.fastjson.asm.Label r4) {
            r2 = this;
            int r0 = r4.status
            r0 = r0 & 2
            if (r0 == 0) goto L18
            int r0 = r4.position
            com.alibaba.fastjson.asm.ByteVector r1 = r2.code
            int r1 = r1.length
            int r0 = r0 - r1
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L12
            goto L18
        L12:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L18:
            com.alibaba.fastjson.asm.ByteVector r0 = r2.code
            r0.putByte(r3)
            com.alibaba.fastjson.asm.ByteVector r3 = r2.code
            int r0 = r3.length
            int r0 = r0 + (-1)
            r4.put(r2, r3, r0)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitLabel(com.alibaba.fastjson.asm.Label r3) {
            r2 = this;
            com.alibaba.fastjson.asm.ByteVector r0 = r2.code
            int r1 = r0.length
            byte[] r0 = r0.data
            r3.resolve(r2, r1, r0)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r3) {
            r2 = this;
            com.alibaba.fastjson.asm.ClassWriter r0 = r2.cw
            com.alibaba.fastjson.asm.Item r3 = r0.newConstItem(r3)
            int r0 = r3.index
            int r3 = r3.type
            r1 = 5
            if (r3 == r1) goto L25
            r1 = 6
            if (r3 != r1) goto L11
            goto L25
        L11:
            r3 = 256(0x100, float:3.59E-43)
            if (r0 < r3) goto L1d
            com.alibaba.fastjson.asm.ByteVector r3 = r2.code
            r1 = 19
            r3.put12(r1, r0)
            return
        L1d:
            com.alibaba.fastjson.asm.ByteVector r3 = r2.code
            r1 = 18
            r3.put11(r1, r0)
            return
        L25:
            com.alibaba.fastjson.asm.ByteVector r3 = r2.code
            r1 = 20
            r3.put12(r1, r0)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitMaxs(int r1, int r2) {
            r0 = this;
            r0.maxStack = r1
            r0.maxLocals = r2
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitMethodInsn(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            r0 = 0
            r1 = 185(0xb9, float:2.59E-43)
            if (r5 != r1) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            com.alibaba.fastjson.asm.ClassWriter r3 = r4.cw
            com.alibaba.fastjson.asm.Item r6 = r3.newMethodItem(r6, r7, r8, r2)
            int r7 = r6.intVal
            if (r2 == 0) goto L28
            if (r7 != 0) goto L1a
            int r7 = com.alibaba.fastjson.asm.Type.getArgumentsAndReturnSizes(r8)
            r6.intVal = r7
        L1a:
            com.alibaba.fastjson.asm.ByteVector r5 = r4.code
            int r6 = r6.index
            com.alibaba.fastjson.asm.ByteVector r5 = r5.put12(r1, r6)
            int r6 = r7 >> 2
            r5.put11(r6, r0)
            return
        L28:
            com.alibaba.fastjson.asm.ByteVector r7 = r4.code
            int r6 = r6.index
            r7.put12(r5, r6)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitTypeInsn(int r2, java.lang.String r3) {
            r1 = this;
            com.alibaba.fastjson.asm.ClassWriter r0 = r1.cw
            com.alibaba.fastjson.asm.Item r3 = r0.newClassItem(r3)
            com.alibaba.fastjson.asm.ByteVector r0 = r1.code
            int r3 = r3.index
            r0.put12(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson.asm.MethodVisitor
    public void visitVarInsn(int r3, int r4) {
            r2 = this;
            r0 = 4
            if (r4 >= r0) goto L1f
            r0 = 169(0xa9, float:2.37E-43)
            if (r3 == r0) goto L1f
            r0 = 54
            if (r3 >= r0) goto L13
            int r3 = r3 + (-21)
            int r3 = r3 << 2
            int r3 = r3 + 26
        L11:
            int r3 = r3 + r4
            goto L19
        L13:
            int r3 = r3 - r0
            int r3 = r3 << 2
            int r3 = r3 + 59
            goto L11
        L19:
            com.alibaba.fastjson.asm.ByteVector r4 = r2.code
            r4.putByte(r3)
            return
        L1f:
            r0 = 256(0x100, float:3.59E-43)
            if (r4 < r0) goto L2f
            com.alibaba.fastjson.asm.ByteVector r0 = r2.code
            r1 = 196(0xc4, float:2.75E-43)
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putByte(r1)
            r0.put12(r3, r4)
            return
        L2f:
            com.alibaba.fastjson.asm.ByteVector r0 = r2.code
            r0.put11(r3, r4)
            return
    }
}
