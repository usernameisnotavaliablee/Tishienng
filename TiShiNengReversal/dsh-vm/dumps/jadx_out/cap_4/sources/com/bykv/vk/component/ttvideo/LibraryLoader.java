package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LibraryLoader {
    private static final java.lang.String TAG = "LibraryLoader";
    private static com.bykv.vk.component.ttvideo.LibraryLoader.Loader sLoader;

    public interface Loader {
        void loadLibrary(java.lang.String r1) throws java.lang.Exception;

        void loadLibraryFromPath(java.lang.String r1) throws java.lang.Exception;
    }

    static {
            return
    }

    public LibraryLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void loadLibrary(java.lang.String r2) throws java.lang.Exception {
            com.bykv.vk.component.ttvideo.LibraryLoader$Loader r0 = com.bykv.vk.component.ttvideo.LibraryLoader.sLoader
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L12
            if (r0 == 0) goto Le
            r0.loadLibrary(r2)
            return
        Le:
            com.bytedance.sdk.openadsdk.l.m.j(r2)
            return
        L12:
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r0 = "Invalid library name."
            r2.<init>(r0)
            throw r2
    }

    public static void loadLibraryFromPath(java.lang.String r3) throws java.lang.Exception {
            com.bykv.vk.component.ttvideo.LibraryLoader$Loader r0 = com.bykv.vk.component.ttvideo.LibraryLoader.sLoader
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L41
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L28
            if (r0 == 0) goto L20
            r1.getAbsolutePath()
            java.lang.String r3 = r1.getAbsolutePath()
            r0.loadLibraryFromPath(r3)
            return
        L20:
            java.lang.String r3 = r1.getAbsolutePath()
            java.lang.System.load(r3)
            return
        L28:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Not found library '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' file."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L41:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r0 = "Invalid library name."
            r3.<init>(r0)
            throw r3
    }

    public static void setupLibraryLoader(com.bykv.vk.component.ttvideo.LibraryLoader.Loader r0) {
            com.bykv.vk.component.ttvideo.LibraryLoader.sLoader = r0
            return
    }
}
