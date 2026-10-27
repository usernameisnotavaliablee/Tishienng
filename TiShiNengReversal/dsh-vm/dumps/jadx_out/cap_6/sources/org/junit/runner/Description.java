package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Description implements java.io.Serializable {
    public static final org.junit.runner.Description EMPTY = null;
    private static final java.util.regex.Pattern METHOD_AND_CLASS_NAME_PATTERN = null;
    public static final org.junit.runner.Description TEST_MECHANISM = null;
    private static final long serialVersionUID = 1;
    private final java.lang.annotation.Annotation[] fAnnotations;
    private final java.util.Collection<org.junit.runner.Description> fChildren;
    private final java.lang.String fDisplayName;
    private volatile java.lang.Class<?> fTestClass;
    private final java.io.Serializable fUniqueId;

    static {
            java.lang.String r0 = "([\\s\\S]*)\\((.*)\\)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.junit.runner.Description.METHOD_AND_CLASS_NAME_PATTERN = r0
            org.junit.runner.Description r0 = new org.junit.runner.Description
            r1 = 0
            java.lang.annotation.Annotation[] r2 = new java.lang.annotation.Annotation[r1]
            r3 = 0
            java.lang.String r4 = "No Tests"
            r0.<init>(r3, r4, r2)
            org.junit.runner.Description.EMPTY = r0
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.String r2 = "Test mechanism"
            java.lang.annotation.Annotation[] r1 = new java.lang.annotation.Annotation[r1]
            r0.<init>(r3, r2, r1)
            org.junit.runner.Description.TEST_MECHANISM = r0
            return
    }

    private Description(java.lang.Class<?> r2, java.lang.String r3, java.io.Serializable r4, java.lang.annotation.Annotation... r5) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r1.fChildren = r0
            if (r3 == 0) goto L25
            int r0 = r3.length()
            if (r0 == 0) goto L25
            if (r4 == 0) goto L1d
            r1.fTestClass = r2
            r1.fDisplayName = r3
            r1.fUniqueId = r4
            r1.fAnnotations = r5
            return
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The unique id must not be null."
            r2.<init>(r3)
            throw r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The display name must not be empty."
            r2.<init>(r3)
            throw r2
    }

    private Description(java.lang.Class<?> r1, java.lang.String r2, java.lang.annotation.Annotation... r3) {
            r0 = this;
            r0.<init>(r1, r2, r2, r3)
            return
    }

    public static org.junit.runner.Description createSuiteDescription(java.lang.Class<?> r3) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.String r1 = r3.getName()
            java.lang.annotation.Annotation[] r2 = r3.getAnnotations()
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static org.junit.runner.Description createSuiteDescription(java.lang.String r2, java.io.Serializable r3, java.lang.annotation.Annotation... r4) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            r1 = 0
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static org.junit.runner.Description createSuiteDescription(java.lang.String r2, java.lang.annotation.Annotation... r3) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static org.junit.runner.Description createTestDescription(java.lang.Class<?> r2, java.lang.String r3) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.String r1 = r2.getName()
            java.lang.String r3 = formatDisplayName(r3, r1)
            r1 = 0
            java.lang.annotation.Annotation[] r1 = new java.lang.annotation.Annotation[r1]
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static org.junit.runner.Description createTestDescription(java.lang.Class<?> r2, java.lang.String r3, java.lang.annotation.Annotation... r4) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.String r1 = r2.getName()
            java.lang.String r3 = formatDisplayName(r3, r1)
            r0.<init>(r2, r3, r4)
            return r0
    }

    public static org.junit.runner.Description createTestDescription(java.lang.String r2, java.lang.String r3, java.io.Serializable r4) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.String r2 = formatDisplayName(r3, r2)
            r3 = 0
            java.lang.annotation.Annotation[] r3 = new java.lang.annotation.Annotation[r3]
            r1 = 0
            r0.<init>(r1, r2, r4, r3)
            return r0
    }

    public static org.junit.runner.Description createTestDescription(java.lang.String r2, java.lang.String r3, java.lang.annotation.Annotation... r4) {
            org.junit.runner.Description r0 = new org.junit.runner.Description
            r1 = 0
            java.lang.String r2 = formatDisplayName(r3, r2)
            r0.<init>(r1, r2, r4)
            return r0
    }

    private static java.lang.String formatDisplayName(java.lang.String r2, java.lang.String r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "%s(%s)"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    private java.lang.String methodAndClassNamePatternGroupOrDefault(int r3, java.lang.String r4) {
            r2 = this;
            java.util.regex.Pattern r0 = org.junit.runner.Description.METHOD_AND_CLASS_NAME_PATTERN
            java.lang.String r1 = r2.toString()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L15
            java.lang.String r3 = r0.group(r3)
            return r3
        L15:
            return r4
    }

    public void addChild(org.junit.runner.Description r2) {
            r1 = this;
            java.util.Collection<org.junit.runner.Description> r0 = r1.fChildren
            r0.add(r2)
            return
    }

    public org.junit.runner.Description childlessCopy() {
            r4 = this;
            org.junit.runner.Description r0 = new org.junit.runner.Description
            java.lang.Class<?> r1 = r4.fTestClass
            java.lang.String r2 = r4.fDisplayName
            java.lang.annotation.Annotation[] r3 = r4.fAnnotations
            r0.<init>(r1, r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.junit.runner.Description
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.junit.runner.Description r2 = (org.junit.runner.Description) r2
            java.io.Serializable r0 = r1.fUniqueId
            java.io.Serializable r2 = r2.fUniqueId
            boolean r2 = r0.equals(r2)
            return r2
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r6) {
            r5 = this;
            java.lang.annotation.Annotation[] r0 = r5.fAnnotations
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            java.lang.Class r4 = r3.annotationType()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L19
            java.lang.Object r6 = r6.cast(r3)
            java.lang.annotation.Annotation r6 = (java.lang.annotation.Annotation) r6
            return r6
        L19:
            int r2 = r2 + 1
            goto L4
        L1c:
            r6 = 0
            return r6
    }

    public java.util.Collection<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.lang.annotation.Annotation[] r0 = r1.fAnnotations
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    public java.util.ArrayList<org.junit.runner.Description> getChildren() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection<org.junit.runner.Description> r1 = r2.fChildren
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r2 = this;
            java.lang.Class<?> r0 = r2.fTestClass
            if (r0 == 0) goto Lb
            java.lang.Class<?> r0 = r2.fTestClass
            java.lang.String r0 = r0.getName()
            return r0
        Lb:
            r0 = 2
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r2.methodAndClassNamePatternGroupOrDefault(r0, r1)
            return r0
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.fDisplayName
            return r0
    }

    public java.lang.String getMethodName() {
            r2 = this;
            r0 = 1
            r1 = 0
            java.lang.String r0 = r2.methodAndClassNamePatternGroupOrDefault(r0, r1)
            return r0
    }

    public java.lang.Class<?> getTestClass() {
            r4 = this;
            java.lang.Class<?> r0 = r4.fTestClass
            if (r0 == 0) goto L7
            java.lang.Class<?> r0 = r4.fTestClass
            return r0
        L7:
            java.lang.String r0 = r4.getClassName()
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L21
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L21
            r4.fTestClass = r0     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.Class<?> r0 = r4.fTestClass     // Catch: java.lang.ClassNotFoundException -> L21
            return r0
        L21:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.io.Serializable r0 = r1.fUniqueId
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            org.junit.runner.Description r0 = org.junit.runner.Description.EMPTY
            boolean r0 = r1.equals(r0)
            return r0
    }

    public boolean isSuite() {
            r1 = this;
            boolean r0 = r1.isTest()
            r0 = r0 ^ 1
            return r0
    }

    public boolean isTest() {
            r1 = this;
            java.util.Collection<org.junit.runner.Description> r0 = r1.fChildren
            boolean r0 = r0.isEmpty()
            return r0
    }

    public int testCount() {
            r3 = this;
            boolean r0 = r3.isTest()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            java.util.Collection<org.junit.runner.Description> r0 = r3.fChildren
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r0.next()
            org.junit.runner.Description r2 = (org.junit.runner.Description) r2
            int r2 = r2.testCount()
            int r1 = r1 + r2
            goto Lf
        L21:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getDisplayName()
            return r0
    }
}
