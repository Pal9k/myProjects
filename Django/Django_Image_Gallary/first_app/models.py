from django.db import models

# Create your models here.
class Image_Gallary(models.Model):
    text = models.CharField(max_length=128)
    description = models.CharField(max_length=512)
    img1 = models.ImageField(upload_to='images/',blank=True)
    img2 = models.ImageField(upload_to='images/',blank=True)
    img3 = models.ImageField(upload_to='images/',blank=True)
    img4 = models.ImageField(upload_to='images/',blank=True)
    img5 = models.ImageField(upload_to='images/',blank=True)
