package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum StandardSystemProperty extends java.lang.Enum<com.google.common.base.StandardSystemProperty> {
    private static final /* synthetic */ com.google.common.base.StandardSystemProperty[] $VALUES = null;
    public static final com.google.common.base.StandardSystemProperty FILE_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_PATH = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_COMPILER = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_EXT_DIRS = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_HOME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_IO_TMPDIR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_LIBRARY_PATH = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR_URL = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty LINE_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty OS_ARCH = null;
    public static final com.google.common.base.StandardSystemProperty OS_NAME = null;
    public static final com.google.common.base.StandardSystemProperty OS_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty PATH_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty USER_DIR = null;
    public static final com.google.common.base.StandardSystemProperty USER_HOME = null;
    public static final com.google.common.base.StandardSystemProperty USER_NAME = null;
    private final java.lang.String key;

    static {
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "java.version"
            java.lang.String r2 = "JAVA_VERSION"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.google.common.base.StandardSystemProperty.JAVA_VERSION = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            java.lang.String r2 = "java.vendor"
            java.lang.String r4 = "JAVA_VENDOR"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.google.common.base.StandardSystemProperty.JAVA_VENDOR = r1
            com.google.common.base.StandardSystemProperty r2 = new com.google.common.base.StandardSystemProperty
            java.lang.String r4 = "java.vendor.url"
            java.lang.String r6 = "JAVA_VENDOR_URL"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.google.common.base.StandardSystemProperty.JAVA_VENDOR_URL = r2
            com.google.common.base.StandardSystemProperty r4 = new com.google.common.base.StandardSystemProperty
            java.lang.String r6 = "java.home"
            java.lang.String r8 = "JAVA_HOME"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.google.common.base.StandardSystemProperty.JAVA_HOME = r4
            com.google.common.base.StandardSystemProperty r6 = new com.google.common.base.StandardSystemProperty
            java.lang.String r8 = "java.vm.specification.version"
            java.lang.String r10 = "JAVA_VM_SPECIFICATION_VERSION"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VERSION = r6
            com.google.common.base.StandardSystemProperty r8 = new com.google.common.base.StandardSystemProperty
            java.lang.String r10 = "java.vm.specification.vendor"
            java.lang.String r12 = "JAVA_VM_SPECIFICATION_VENDOR"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VENDOR = r8
            com.google.common.base.StandardSystemProperty r10 = new com.google.common.base.StandardSystemProperty
            java.lang.String r12 = "java.vm.specification.name"
            java.lang.String r14 = "JAVA_VM_SPECIFICATION_NAME"
            r15 = 6
            r10.<init>(r14, r15, r12)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_NAME = r10
            com.google.common.base.StandardSystemProperty r12 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.vm.version"
            r16 = 0
            java.lang.String r3 = "JAVA_VM_VERSION"
            r17 = 1
            r5 = 7
            r12.<init>(r3, r5, r14)
            com.google.common.base.StandardSystemProperty.JAVA_VM_VERSION = r12
            com.google.common.base.StandardSystemProperty r3 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.vm.vendor"
            r18 = 7
            java.lang.String r5 = "JAVA_VM_VENDOR"
            r19 = 2
            r7 = 8
            r3.<init>(r5, r7, r14)
            com.google.common.base.StandardSystemProperty.JAVA_VM_VENDOR = r3
            com.google.common.base.StandardSystemProperty r5 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.vm.name"
            r20 = 8
            java.lang.String r7 = "JAVA_VM_NAME"
            r21 = 3
            r9 = 9
            r5.<init>(r7, r9, r14)
            com.google.common.base.StandardSystemProperty.JAVA_VM_NAME = r5
            com.google.common.base.StandardSystemProperty r7 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.specification.version"
            r22 = 9
            java.lang.String r9 = "JAVA_SPECIFICATION_VERSION"
            r23 = 4
            r11 = 10
            r7.<init>(r9, r11, r14)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VERSION = r7
            com.google.common.base.StandardSystemProperty r9 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.specification.vendor"
            r24 = 10
            java.lang.String r11 = "JAVA_SPECIFICATION_VENDOR"
            r25 = 5
            r13 = 11
            r9.<init>(r11, r13, r14)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VENDOR = r9
            com.google.common.base.StandardSystemProperty r11 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.specification.name"
            r26 = 11
            java.lang.String r13 = "JAVA_SPECIFICATION_NAME"
            r27 = 6
            r15 = 12
            r11.<init>(r13, r15, r14)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_NAME = r11
            com.google.common.base.StandardSystemProperty r13 = new com.google.common.base.StandardSystemProperty
            java.lang.String r14 = "java.class.version"
            r28 = 12
            java.lang.String r15 = "JAVA_CLASS_VERSION"
            r29 = r0
            r0 = 13
            r13.<init>(r15, r0, r14)
            com.google.common.base.StandardSystemProperty.JAVA_CLASS_VERSION = r13
            com.google.common.base.StandardSystemProperty r14 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "java.class.path"
            r30 = 13
            java.lang.String r0 = "JAVA_CLASS_PATH"
            r31 = r1
            r1 = 14
            r14.<init>(r0, r1, r15)
            com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH = r14
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "java.library.path"
            r32 = 14
            java.lang.String r1 = "JAVA_LIBRARY_PATH"
            r33 = r2
            r2 = 15
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.JAVA_LIBRARY_PATH = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "java.io.tmpdir"
            r34 = 15
            java.lang.String r2 = "JAVA_IO_TMPDIR"
            r35 = r0
            r0 = 16
            r1.<init>(r2, r0, r15)
            com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR = r1
            com.google.common.base.StandardSystemProperty r2 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "java.compiler"
            r36 = 16
            java.lang.String r0 = "JAVA_COMPILER"
            r37 = r1
            r1 = 17
            r2.<init>(r0, r1, r15)
            com.google.common.base.StandardSystemProperty.JAVA_COMPILER = r2
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "java.ext.dirs"
            r38 = 17
            java.lang.String r1 = "JAVA_EXT_DIRS"
            r39 = r2
            r2 = 18
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.JAVA_EXT_DIRS = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "os.name"
            r40 = 18
            java.lang.String r2 = "OS_NAME"
            r41 = r0
            r0 = 19
            r1.<init>(r2, r0, r15)
            com.google.common.base.StandardSystemProperty.OS_NAME = r1
            com.google.common.base.StandardSystemProperty r2 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "os.arch"
            r42 = 19
            java.lang.String r0 = "OS_ARCH"
            r43 = r1
            r1 = 20
            r2.<init>(r0, r1, r15)
            com.google.common.base.StandardSystemProperty.OS_ARCH = r2
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r15 = "os.version"
            r44 = 20
            java.lang.String r1 = "OS_VERSION"
            r45 = r2
            r2 = 21
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.OS_VERSION = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            r15 = 22
            r46 = 21
            java.lang.String r2 = "file.separator"
            r47 = r0
            java.lang.String r0 = "FILE_SEPARATOR"
            r1.<init>(r0, r15, r2)
            com.google.common.base.StandardSystemProperty.FILE_SEPARATOR = r1
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            r2 = 23
            java.lang.String r15 = "path.separator"
            r48 = r1
            java.lang.String r1 = "PATH_SEPARATOR"
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.PATH_SEPARATOR = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            r2 = 24
            java.lang.String r15 = "line.separator"
            r49 = r0
            java.lang.String r0 = "LINE_SEPARATOR"
            r1.<init>(r0, r2, r15)
            com.google.common.base.StandardSystemProperty.LINE_SEPARATOR = r1
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            r2 = 25
            java.lang.String r15 = "user.name"
            r50 = r1
            java.lang.String r1 = "USER_NAME"
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.USER_NAME = r0
            com.google.common.base.StandardSystemProperty r1 = new com.google.common.base.StandardSystemProperty
            r2 = 26
            java.lang.String r15 = "user.home"
            r51 = r0
            java.lang.String r0 = "USER_HOME"
            r1.<init>(r0, r2, r15)
            com.google.common.base.StandardSystemProperty.USER_HOME = r1
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            r2 = 27
            java.lang.String r15 = "user.dir"
            r52 = r1
            java.lang.String r1 = "USER_DIR"
            r0.<init>(r1, r2, r15)
            com.google.common.base.StandardSystemProperty.USER_DIR = r0
            r1 = 28
            com.google.common.base.StandardSystemProperty[] r1 = new com.google.common.base.StandardSystemProperty[r1]
            r1[r16] = r29
            r1[r17] = r31
            r1[r19] = r33
            r1[r21] = r4
            r1[r23] = r6
            r1[r25] = r8
            r1[r27] = r10
            r1[r18] = r12
            r1[r20] = r3
            r1[r22] = r5
            r1[r24] = r7
            r1[r26] = r9
            r1[r28] = r11
            r1[r30] = r13
            r1[r32] = r14
            r1[r34] = r35
            r1[r36] = r37
            r1[r38] = r39
            r1[r40] = r41
            r1[r42] = r43
            r1[r44] = r45
            r1[r46] = r47
            r2 = 22
            r1[r2] = r48
            r2 = 23
            r1[r2] = r49
            r2 = 24
            r1[r2] = r50
            r2 = 25
            r1[r2] = r51
            r2 = 26
            r1[r2] = r52
            r2 = 27
            r1[r2] = r0
            com.google.common.base.StandardSystemProperty.$VALUES = r1
            return
    }

    StandardSystemProperty(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.key = r3
            return
    }

    public static com.google.common.base.StandardSystemProperty valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.base.StandardSystemProperty> r0 = com.google.common.base.StandardSystemProperty.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.base.StandardSystemProperty r1 = (com.google.common.base.StandardSystemProperty) r1
            return r1
    }

    public static com.google.common.base.StandardSystemProperty[] values() {
            com.google.common.base.StandardSystemProperty[] r0 = com.google.common.base.StandardSystemProperty.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.base.StandardSystemProperty[] r0 = (com.google.common.base.StandardSystemProperty[]) r0
            return r0
    }

    public java.lang.String key() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.key()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.String r1 = r2.value()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.key
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }
}
