from django.shortcuts import render
from .models import Image_Gallary

# Create your views here.
def index(request):
    if request.method == 'POST':
        img=Image_Gallary()
        img.text = request.POST.get('txt')
        img.description = request.POST.get('description')

        if request.POST.get('img1'):
            img.img1 = request.POST.get('img1')

        img.save()

        return render(request, 'first_app/index.html')

    else:
        return render(request,'first_app/index.html')
