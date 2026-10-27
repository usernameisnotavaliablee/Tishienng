package com.bxkj.student.home.teaching.homework.question;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class PdfViewActivity extends cn.bluemobi.dylan.base.BaseActivity {
    public PdfViewActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void L() {
            r0 = this;
            return
    }

    protected int N() {
            r1 = this;
            r0 = 2131493634(0x7f0c0302, float:1.8610754E38)
            return r0
    }

    public void R() {
            r4 = this;
            com.bxkj.student.home.teaching.learning.detail.type.PdfFragment r0 = new com.bxkj.student.home.teaching.learning.detail.type.PdfFragment
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r3 = "url"
            boolean r2 = r2.hasExtra(r3)
            if (r2 == 0) goto L22
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r2 = r2.getStringExtra(r3)
            r1.putString(r3, r2)
            goto L39
        L22:
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r3 = "filePath"
            boolean r2 = r2.hasExtra(r3)
            if (r2 == 0) goto L39
            android.content.Intent r2 = r4.getIntent()
            java.lang.String r2 = r2.getStringExtra(r3)
            r1.putString(r3, r2)
        L39:
            r0.setArguments(r1)
            androidx.fragment.app.FragmentManager r1 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r2 = 2131298068(0x7f090714, float:1.8214099E38)
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r2, r0)
            r0.commitAllowingStateLoss()
            return
    }

    public void S() {
            r2 = this;
            java.lang.String r0 = "预览PDF文件"
            r2.setTitle(r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "title"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1c
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.setTitle(r0)
        L1c:
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
