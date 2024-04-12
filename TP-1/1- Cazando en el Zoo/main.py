import flet as ft

def on_button_click():
    print("Hola")

def main(page: ft.Page):
    # page.title = "App de Zoo"
    
    page.window_width = 720
    page.window_height = 800
    page.window_resizable = False
    page.padding = 0
    title=ft.Text("App de Zoo", size=30, color="purple200")
    
    def addAnimal(e):
        print("Añadir Animal")
        page.update()
        
    def calculateFood(e):
        print("Calcular Comida")
    
    addAnimal = ft.Stack(
     [
        ft.TextButton(
            "Añadir Animal",
            icon="add",
            icon_color="purple200",
            style=ft.ButtonStyle(
                color={
                    ft.MaterialState.HOVERED: ft.colors.WHITE,
                    ft.MaterialState.FOCUSED: ft.colors.BLUE,
                    ft.MaterialState.DEFAULT: ft.colors.PURPLE_100,
                },
                padding={ft.MaterialState.HOVERED: 20},
                overlay_color=ft.colors.TRANSPARENT,
                elevation={"pressed": 0, "": 1},
                animation_duration=500,
                shape={
                    ft.MaterialState.HOVERED: ft.RoundedRectangleBorder(radius=15),
                    ft.MaterialState.DEFAULT: ft.RoundedRectangleBorder(radius=2),
                },
            ),
            on_click=addAnimal,
        ),
     ]   
    )
    
    calculateFood = ft.Stack(
     [
        ft.TextButton(
            "Calcular Comida",
            icon="calculate",
            icon_color="purple200",
            style=ft.ButtonStyle(
                color={
                    ft.MaterialState.HOVERED: ft.colors.WHITE,
                    ft.MaterialState.FOCUSED: ft.colors.BLUE,
                    ft.MaterialState.DEFAULT: ft.colors.PURPLE_100,
                },
                padding={ft.MaterialState.HOVERED: 20},
                overlay_color=ft.colors.TRANSPARENT,
                elevation={"pressed": 0, "": 1},
                animation_duration=500,
                shape={
                    ft.MaterialState.HOVERED: ft.RoundedRectangleBorder(radius=15),
                    ft.MaterialState.DEFAULT: ft.RoundedRectangleBorder(radius=2),
                },
            ),
            on_click=calculateFood,
        ),
     ]   
    )
    
    
    
    kgs = ft.Stack(
        [
            ft.Text(f"Kgs Carnivoros: ", left=20, top=20, size=15, color="purple200"),
            ft.Text(f"Kgs Herbivoros: ", left=20, top=40, size=15, color="purple200"),
            ft.Text(f"Kgs Totales: ", left=20, bottom=20, size=15, color="purple200"),
        ]
    )
    
    options = [
        ft.Container(addAnimal, width=200, height=100, 
                     alignment=ft.alignment.center),
        ft.Container(calculateFood, width=200, height=100, 
                     alignment=ft.alignment.center),
        ft.Container(kgs, width=225, height=100, alignment=ft.alignment.center)
    ]
    
    buttons = ft.Container(content=ft.Row(options), height=100, width=720, 
                           alignment=ft.alignment.center, 
                           margin=ft.margin.all(20)) 
    
    def getSpecies(id):
        return "León"
    
    def getUbication(id):
        return "Ubicación"
    
    def getText(id):          
        texto = ft.Stack(
            [
                ft.Text(f"Sección {id}", size=50, color="blue900", bottom=500),
                ft.Text(f"Especies: {getSpecies(1)}", size=15, color="blue900", bottom=450),
                ft.Text("Cantidad Max de Animales: 10", size=15, color="blue900", bottom=150),
                ft.Text(f"Ubicación: {getUbication(1)}", size=15, color="blue900", bottom=100),
            ],   
        )
        
        return texto
    
    col = ft.Row(
            [
                ft.Container(
                    getText(1),
                    bgcolor=ft.colors.ORANGE_300,
                    alignment=ft.alignment.center,
                    expand=1,
                ),
                 ft.VerticalDivider(),
                ft.Container(
                    getText(2),
                    bgcolor=ft.colors.GREEN_300,
                    alignment=ft.alignment.center,
                    expand=1,
                ),
                 ft.VerticalDivider(),
                ft.Container(
                    getText(3),
                    bgcolor=ft.colors.GREY_500,
                    alignment=ft.alignment.center,
                    expand=1,
                ),
            ],
            spacing=0,
            expand=True,
        )

    
    sections = ft.Container(col, height=600, width=720, alignment=ft.alignment.top_center, margin=ft.margin.all(10), border=ft.border.all())
    
    col = ft.Column(spacing=0, controls=[
        buttons,
        sections
    ]) 
    
    container = ft.Container(col, width=720, height=800, alignment=ft.alignment.top_center)
    
    page.add(container)

ft.app(target=main)
