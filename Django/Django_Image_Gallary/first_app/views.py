from django.shortcuts import render
from .models import Image_Gallary

# Create your views here.
def index(request):
    if request.method == 'POST':
        img=Image_Gallary()
        img.text = request.POST.get('txt')
        img.description = request.POST.get('description')

        # if request.POST.get('img1'):
        #     img.img1 = request.POST.get('img1')
        #     print(request.POST.get('img1'))

        if 'img1' in request.FILES:
            img.img1=request.FILES.get('img1')
        if 'img2' in request.FILES:
            img.img2=request.FILES.get('img2')
        if 'img3' in request.FILES:
            img.img3=request.FILES.get('img3')
        if 'img4' in request.FILES:
            img.img4=request.FILES.get('img4')
        if 'img5' in request.FILES:
            img.img5=request.FILES.get('img5')

        img.save()

        return render(request, 'first_app/show_image.html', {'text':img.text,'description':img.description,'img1':'media/'+str(img.img1)})

    else:
        return render(request,'first_app/index.html')
