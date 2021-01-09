import ProductsList from "./ProductsList"

export type Product = {
    id: number,
    name: string,
    price: number,
    description: string,
    image_Uri: string
}

export type OrderLocationData = {
    address: string,
    latitude: number,
    longitude: number
}

type ProductId = {
    id: number;
}

export type OrderPayload = {
    products: ProductId[];
} & OrderLocationData;


