from PIL import Image
import numpy as np, sys
p=sys.argv[1]; o=sys.argv[2]
im=Image.open(p).convert('RGB')
a=np.array(im).astype(int)
R,G,B=a[:,:,0],a[:,:,1],a[:,:,2]
mask=(R>110)&((R-G)>40)&((R-B)>40)
out=np.where(mask,0,255).astype('uint8')
img=Image.fromarray(out).resize((out.shape[1]*4,out.shape[0]*4),Image.LANCZOS)
img.save(o)
print('red pixels:',int(mask.sum()),'->',o)
