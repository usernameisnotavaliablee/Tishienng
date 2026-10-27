package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ClassWriter {
    private int access;
    com.alibaba.fastjson.asm.FieldWriter firstField;
    com.alibaba.fastjson.asm.MethodWriter firstMethod;
    int index;
    private int interfaceCount;
    private int[] interfaces;
    com.alibaba.fastjson.asm.Item[] items;
    final com.alibaba.fastjson.asm.Item key;
    final com.alibaba.fastjson.asm.Item key2;
    final com.alibaba.fastjson.asm.Item key3;
    com.alibaba.fastjson.asm.FieldWriter lastField;
    com.alibaba.fastjson.asm.MethodWriter lastMethod;
    private int name;
    final com.alibaba.fastjson.asm.ByteVector pool;
    private int superName;
    java.lang.String thisName;
    int threshold;
    com.alibaba.fastjson.asm.Item[] typeTable;
    int version;

    public ClassWriter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private ClassWriter(int r5) {
            r4 = this;
            r4.<init>()
            r5 = 1
            r4.index = r5
            com.alibaba.fastjson.asm.ByteVector r5 = new com.alibaba.fastjson.asm.ByteVector
            r5.<init>()
            r4.pool = r5
            r5 = 256(0x100, float:3.59E-43)
            com.alibaba.fastjson.asm.Item[] r5 = new com.alibaba.fastjson.asm.Item[r5]
            r4.items = r5
            int r5 = r5.length
            double r0 = (double) r5
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            int r5 = (int) r0
            r4.threshold = r5
            com.alibaba.fastjson.asm.Item r5 = new com.alibaba.fastjson.asm.Item
            r5.<init>()
            r4.key = r5
            com.alibaba.fastjson.asm.Item r5 = new com.alibaba.fastjson.asm.Item
            r5.<init>()
            r4.key2 = r5
            com.alibaba.fastjson.asm.Item r5 = new com.alibaba.fastjson.asm.Item
            r5.<init>()
            r4.key3 = r5
            return
    }

    private com.alibaba.fastjson.asm.Item get(com.alibaba.fastjson.asm.Item r4) {
            r3 = this;
            com.alibaba.fastjson.asm.Item[] r0 = r3.items
            int r1 = r4.hashCode
            int r2 = r0.length
            int r1 = r1 % r2
            r0 = r0[r1]
        L8:
            if (r0 == 0) goto L19
            int r1 = r0.type
            int r2 = r4.type
            if (r1 != r2) goto L16
            boolean r1 = r4.isEqualTo(r0)
            if (r1 != 0) goto L19
        L16:
            com.alibaba.fastjson.asm.Item r0 = r0.next
            goto L8
        L19:
            return r0
    }

    private com.alibaba.fastjson.asm.Item newString(java.lang.String r4) {
            r3 = this;
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            r1 = 0
            r2 = 8
            r0.set(r2, r4, r1, r1)
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            com.alibaba.fastjson.asm.Item r0 = r3.get(r0)
            if (r0 != 0) goto L2a
            com.alibaba.fastjson.asm.ByteVector r0 = r3.pool
            int r4 = r3.newUTF8(r4)
            r0.put12(r2, r4)
            com.alibaba.fastjson.asm.Item r4 = new com.alibaba.fastjson.asm.Item
            int r0 = r3.index
            int r1 = r0 + 1
            r3.index = r1
            com.alibaba.fastjson.asm.Item r1 = r3.key2
            r4.<init>(r0, r1)
            r3.put(r4)
            return r4
        L2a:
            return r0
    }

    private void put(com.alibaba.fastjson.asm.Item r8) {
            r7 = this;
            int r0 = r7.index
            int r1 = r7.threshold
            if (r0 <= r1) goto L33
            com.alibaba.fastjson.asm.Item[] r0 = r7.items
            int r0 = r0.length
            int r1 = r0 * 2
            int r1 = r1 + 1
            com.alibaba.fastjson.asm.Item[] r2 = new com.alibaba.fastjson.asm.Item[r1]
            int r0 = r0 + (-1)
        L11:
            if (r0 < 0) goto L29
            com.alibaba.fastjson.asm.Item[] r3 = r7.items
            r3 = r3[r0]
        L17:
            if (r3 == 0) goto L26
            int r4 = r3.hashCode
            int r4 = r4 % r1
            com.alibaba.fastjson.asm.Item r5 = r3.next
            r6 = r2[r4]
            r3.next = r6
            r2[r4] = r3
            r3 = r5
            goto L17
        L26:
            int r0 = r0 + (-1)
            goto L11
        L29:
            r7.items = r2
            double r0 = (double) r1
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            int r0 = (int) r0
            r7.threshold = r0
        L33:
            int r0 = r8.hashCode
            com.alibaba.fastjson.asm.Item[] r1 = r7.items
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            r8.next = r2
            r1[r0] = r8
            return
    }

    public com.alibaba.fastjson.asm.Item newClassItem(java.lang.String r4) {
            r3 = this;
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            r1 = 0
            r2 = 7
            r0.set(r2, r4, r1, r1)
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            com.alibaba.fastjson.asm.Item r0 = r3.get(r0)
            if (r0 != 0) goto L29
            com.alibaba.fastjson.asm.ByteVector r0 = r3.pool
            int r4 = r3.newUTF8(r4)
            r0.put12(r2, r4)
            com.alibaba.fastjson.asm.Item r4 = new com.alibaba.fastjson.asm.Item
            int r0 = r3.index
            int r1 = r0 + 1
            r3.index = r1
            com.alibaba.fastjson.asm.Item r1 = r3.key2
            r4.<init>(r0, r1)
            r3.put(r4)
            return r4
        L29:
            return r0
    }

    com.alibaba.fastjson.asm.Item newConstItem(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L33
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.alibaba.fastjson.asm.Item r0 = r3.key
            r0.set(r4)
            com.alibaba.fastjson.asm.Item r0 = r3.key
            com.alibaba.fastjson.asm.Item r0 = r3.get(r0)
            if (r0 != 0) goto L32
            com.alibaba.fastjson.asm.ByteVector r0 = r3.pool
            r1 = 3
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putByte(r1)
            r0.putInt(r4)
            com.alibaba.fastjson.asm.Item r4 = new com.alibaba.fastjson.asm.Item
            int r0 = r3.index
            int r1 = r0 + 1
            r3.index = r1
            com.alibaba.fastjson.asm.Item r1 = r3.key
            r4.<init>(r0, r1)
            r3.put(r4)
            return r4
        L32:
            return r0
        L33:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L3e
            java.lang.String r4 = (java.lang.String) r4
            com.alibaba.fastjson.asm.Item r4 = r3.newString(r4)
            return r4
        L3e:
            boolean r0 = r4 instanceof com.alibaba.fastjson.asm.Type
            if (r0 == 0) goto L58
            com.alibaba.fastjson.asm.Type r4 = (com.alibaba.fastjson.asm.Type) r4
            int r0 = r4.sort
            r1 = 10
            if (r0 != r1) goto L4f
            java.lang.String r4 = r4.getInternalName()
            goto L53
        L4f:
            java.lang.String r4 = r4.getDescriptor()
        L53:
            com.alibaba.fastjson.asm.Item r4 = r3.newClassItem(r4)
            return r4
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "value "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    com.alibaba.fastjson.asm.Item newFieldItem(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            com.alibaba.fastjson.asm.Item r0 = r2.key3
            r1 = 9
            r0.set(r1, r3, r4, r5)
            com.alibaba.fastjson.asm.Item r0 = r2.key3
            com.alibaba.fastjson.asm.Item r0 = r2.get(r0)
            if (r0 != 0) goto L35
            com.alibaba.fastjson.asm.Item r3 = r2.newClassItem(r3)
            int r3 = r3.index
            com.alibaba.fastjson.asm.Item r4 = r2.newNameTypeItem(r4, r5)
            int r4 = r4.index
            com.alibaba.fastjson.asm.ByteVector r5 = r2.pool
            com.alibaba.fastjson.asm.ByteVector r3 = r5.put12(r1, r3)
            r3.putShort(r4)
            com.alibaba.fastjson.asm.Item r3 = new com.alibaba.fastjson.asm.Item
            int r4 = r2.index
            int r5 = r4 + 1
            r2.index = r5
            com.alibaba.fastjson.asm.Item r5 = r2.key3
            r3.<init>(r4, r5)
            r2.put(r3)
            return r3
        L35:
            return r0
    }

    com.alibaba.fastjson.asm.Item newMethodItem(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto L5
            r5 = 11
            goto L7
        L5:
            r5 = 10
        L7:
            com.alibaba.fastjson.asm.Item r0 = r1.key3
            r0.set(r5, r2, r3, r4)
            com.alibaba.fastjson.asm.Item r0 = r1.key3
            com.alibaba.fastjson.asm.Item r0 = r1.get(r0)
            if (r0 != 0) goto L3a
            com.alibaba.fastjson.asm.Item r2 = r1.newClassItem(r2)
            int r2 = r2.index
            com.alibaba.fastjson.asm.Item r3 = r1.newNameTypeItem(r3, r4)
            int r3 = r3.index
            com.alibaba.fastjson.asm.ByteVector r4 = r1.pool
            com.alibaba.fastjson.asm.ByteVector r2 = r4.put12(r5, r2)
            r2.putShort(r3)
            com.alibaba.fastjson.asm.Item r2 = new com.alibaba.fastjson.asm.Item
            int r3 = r1.index
            int r4 = r3 + 1
            r1.index = r4
            com.alibaba.fastjson.asm.Item r4 = r1.key3
            r2.<init>(r3, r4)
            r1.put(r2)
            return r2
        L3a:
            return r0
    }

    public com.alibaba.fastjson.asm.Item newNameTypeItem(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            r1 = 0
            r2 = 12
            r0.set(r2, r4, r5, r1)
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            com.alibaba.fastjson.asm.Item r0 = r3.get(r0)
            if (r0 != 0) goto L32
            int r4 = r3.newUTF8(r4)
            int r5 = r3.newUTF8(r5)
            com.alibaba.fastjson.asm.ByteVector r0 = r3.pool
            com.alibaba.fastjson.asm.ByteVector r4 = r0.put12(r2, r4)
            r4.putShort(r5)
            com.alibaba.fastjson.asm.Item r4 = new com.alibaba.fastjson.asm.Item
            int r5 = r3.index
            int r0 = r5 + 1
            r3.index = r0
            com.alibaba.fastjson.asm.Item r0 = r3.key2
            r4.<init>(r5, r0)
            r3.put(r4)
            return r4
        L32:
            return r0
    }

    public int newUTF8(java.lang.String r4) {
            r3 = this;
            com.alibaba.fastjson.asm.Item r0 = r3.key
            r1 = 0
            r2 = 1
            r0.set(r2, r4, r1, r1)
            com.alibaba.fastjson.asm.Item r0 = r3.key
            com.alibaba.fastjson.asm.Item r0 = r3.get(r0)
            if (r0 != 0) goto L28
            com.alibaba.fastjson.asm.ByteVector r0 = r3.pool
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putByte(r2)
            r0.putUTF8(r4)
            com.alibaba.fastjson.asm.Item r0 = new com.alibaba.fastjson.asm.Item
            int r4 = r3.index
            int r1 = r4 + 1
            r3.index = r1
            com.alibaba.fastjson.asm.Item r1 = r3.key
            r0.<init>(r4, r1)
            r3.put(r0)
        L28:
            int r4 = r0.index
            return r4
    }

    public byte[] toByteArray() {
            r7 = this;
            int r0 = r7.interfaceCount
            int r0 = r0 * 2
            int r0 = r0 + 24
            com.alibaba.fastjson.asm.FieldWriter r1 = r7.firstField
            r2 = 0
            r3 = 0
        La:
            if (r1 == 0) goto L16
            int r3 = r3 + 1
            int r4 = r1.getSize()
            int r0 = r0 + r4
            com.alibaba.fastjson.asm.FieldWriter r1 = r1.next
            goto La
        L16:
            com.alibaba.fastjson.asm.MethodWriter r1 = r7.firstMethod
            r4 = 0
        L19:
            if (r1 == 0) goto L25
            int r4 = r4 + 1
            int r5 = r1.getSize()
            int r0 = r0 + r5
            com.alibaba.fastjson.asm.MethodWriter r1 = r1.next
            goto L19
        L25:
            com.alibaba.fastjson.asm.ByteVector r1 = r7.pool
            int r1 = r1.length
            int r0 = r0 + r1
            com.alibaba.fastjson.asm.ByteVector r1 = new com.alibaba.fastjson.asm.ByteVector
            r1.<init>(r0)
            r0 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            com.alibaba.fastjson.asm.ByteVector r0 = r1.putInt(r0)
            int r5 = r7.version
            r0.putInt(r5)
            int r0 = r7.index
            com.alibaba.fastjson.asm.ByteVector r0 = r1.putShort(r0)
            com.alibaba.fastjson.asm.ByteVector r5 = r7.pool
            byte[] r6 = r5.data
            int r5 = r5.length
            r0.putByteArray(r6, r2, r5)
            int r0 = r7.access
            r5 = -393217(0xfffffffffff9ffff, float:NaN)
            r0 = r0 & r5
            com.alibaba.fastjson.asm.ByteVector r0 = r1.putShort(r0)
            int r5 = r7.name
            com.alibaba.fastjson.asm.ByteVector r0 = r0.putShort(r5)
            int r5 = r7.superName
            r0.putShort(r5)
            int r0 = r7.interfaceCount
            r1.putShort(r0)
            r0 = 0
        L65:
            int r5 = r7.interfaceCount
            if (r0 >= r5) goto L73
            int[] r5 = r7.interfaces
            r5 = r5[r0]
            r1.putShort(r5)
            int r0 = r0 + 1
            goto L65
        L73:
            r1.putShort(r3)
            com.alibaba.fastjson.asm.FieldWriter r0 = r7.firstField
        L78:
            if (r0 == 0) goto L80
            r0.put(r1)
            com.alibaba.fastjson.asm.FieldWriter r0 = r0.next
            goto L78
        L80:
            r1.putShort(r4)
            com.alibaba.fastjson.asm.MethodWriter r0 = r7.firstMethod
        L85:
            if (r0 == 0) goto L8d
            r0.put(r1)
            com.alibaba.fastjson.asm.MethodWriter r0 = r0.next
            goto L85
        L8d:
            r1.putShort(r2)
            byte[] r0 = r1.data
            return r0
    }

    public void visit(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String[] r5) {
            r0 = this;
            r0.version = r1
            r0.access = r2
            com.alibaba.fastjson.asm.Item r1 = r0.newClassItem(r3)
            int r1 = r1.index
            r0.name = r1
            r0.thisName = r3
            r1 = 0
            if (r4 != 0) goto L13
            r2 = 0
            goto L19
        L13:
            com.alibaba.fastjson.asm.Item r2 = r0.newClassItem(r4)
            int r2 = r2.index
        L19:
            r0.superName = r2
            if (r5 == 0) goto L3a
            int r2 = r5.length
            if (r2 <= 0) goto L3a
            int r2 = r5.length
            r0.interfaceCount = r2
            int[] r2 = new int[r2]
            r0.interfaces = r2
        L27:
            int r2 = r0.interfaceCount
            if (r1 >= r2) goto L3a
            int[] r2 = r0.interfaces
            r3 = r5[r1]
            com.alibaba.fastjson.asm.Item r3 = r0.newClassItem(r3)
            int r3 = r3.index
            r2[r1] = r3
            int r1 = r1 + 1
            goto L27
        L3a:
            return
    }
}
